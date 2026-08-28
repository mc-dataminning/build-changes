import com.google.common.base.Suppliers;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ask {
   private static final Logger d = LogUtils.getLogger();
   public static final Supplier<NioEventLoopGroup> a = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> b = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build())
   );
   final MinecraftServer e;
   public volatile boolean c;
   private final List<ChannelFuture> f = Collections.synchronizedList(Lists.newArrayList());
   final List<vy> g = Collections.synchronizedList(Lists.newArrayList());

   public ask(MinecraftServer $$0) {
      this.e = $$0;
      this.c = true;
   }

   public void a(@Nullable InetAddress $$0, int $$1) throws IOException {
      synchronized (this.f) {
         Class<? extends ServerSocketChannel> $$2;
         EventLoopGroup $$3;
         if (Epoll.isAvailable() && this.e.p()) {
            $$2 = EpollServerSocketChannel.class;
            $$3 = (EventLoopGroup)b.get();
            d.info("Using epoll channel type");
         } else {
            $$2 = NioServerSocketChannel.class;
            $$3 = (EventLoopGroup)a.get();
            d.info("Using default channel type");
         }

         this.f.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel($$2)).childHandler(new ChannelInitializer<Channel>() {
            protected void initChannel(Channel $$0) {
               try {
                  $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
               } catch (ChannelException var5) {
               }

               ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
               if (ask.this.e.am()) {
                  $$1.addLast("legacy_query", new asd(ask.this.d()));
               }

               vy.a($$1, zm.a, false, null);
               int $$2 = ask.this.e.o();
               vy $$3 = (vy)($$2 > 0 ? new wo($$2) : new vy(zm.a));
               ask.this.g.add($$3);
               $$3.a($$1);
               $$3.a(new asm(ask.this.e, $$3));
            }
         }).group($$3).localAddress($$0, $$1)).bind().syncUninterruptibly());
      }
   }

   public SocketAddress a() {
      ChannelFuture $$0;
      synchronized (this.f) {
         $$0 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler(new ChannelInitializer<Channel>() {
            protected void initChannel(Channel $$0) {
               vy $$1 = new vy(zm.a);
               $$1.a(new asf(ask.this.e, $$1));
               ask.this.g.add($$1);
               ChannelPipeline $$2 = $$0.pipeline();
               vy.a($$2, zm.a);
               $$1.a($$2);
            }
         }).group((EventLoopGroup)a.get()).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
         this.f.add($$0);
      }

      return $$0.channel().localAddress();
   }

   public void b() {
      this.c = false;

      for (ChannelFuture $$0 : this.f) {
         try {
            $$0.channel().close().sync();
         } catch (InterruptedException var4) {
            d.error("Interrupted whilst closing channel");
         }
      }
   }

   public void c() {
      synchronized (this.g) {
         Iterator<vy> $$0 = this.g.iterator();

         while ($$0.hasNext()) {
            vy $$1 = $$0.next();
            if (!$$1.j()) {
               if ($$1.i()) {
                  try {
                     $$1.b();
                  } catch (Exception var7) {
                     if ($$1.e()) {
                        throw new z(o.a(var7, "Ticking memory connection"));
                     }

                     d.warn("Failed to handle packet for {}", $$1.a(this.e.bm()), var7);
                     xe $$3 = xe.b("Internal server error");
                     $$1.a(new zu($$3), wl.a(() -> $$1.a($$3)));
                     $$1.m();
                  }
               } else {
                  $$0.remove();
                  $$1.n();
               }
            }
         }
      }
   }

   public MinecraftServer d() {
      return this.e;
   }

   public List<vy> e() {
      return this.g;
   }

   static class a extends ChannelInboundHandlerAdapter {
      private static final Timer a = new HashedWheelTimer();
      private final int b;
      private final int c;
      private final List<ask.a.a> d = Lists.newArrayList();

      public a(int $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void channelRead(ChannelHandlerContext $$0, Object $$1) {
         this.a($$0, $$1);
      }

      private void a(ChannelHandlerContext $$0, Object $$1) {
         int $$2 = this.b + (int)(Math.random() * (double)this.c);
         this.d.add(new ask.a.a($$0, $$1));
         a.newTimeout(this::a, (long)$$2, TimeUnit.MILLISECONDS);
      }

      private void a(Timeout $$0) {
         ask.a.a $$1 = this.d.remove(0);
         $$1.a.fireChannelRead($$1.b);
      }

      static class a {
         public final ChannelHandlerContext a;
         public final Object b;

         public a(ChannelHandlerContext $$0, Object $$1) {
            this.a = $$0;
            this.b = $$1;
         }
      }
   }
}
