import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fff {
   static final Splitter a = Splitter.on('\u0000').limit(6);
   private static final Logger b = LogUtils.getLogger();
   private static final sw c = sw.c("multiplayer.status.cannot_connect").a($$0 -> $$0.a(-65536));
   private final List<sd> d = Collections.synchronizedList(Lists.newArrayList());

   public void a(final ffd $$0, final Runnable $$1) throws UnknownHostException {
      fga $$2 = fga.a($$0.b);
      Optional<InetSocketAddress> $$3 = fgc.a.a($$2).map(ffz::d);
      if (!$$3.isPresent()) {
         this.a(etl.a, $$0);
      } else {
         final InetSocketAddress $$4 = $$3.get();
         final sd $$5 = sd.a($$4, false);
         this.d.add($$5);
         $$0.d = sw.c("multiplayer.status.pinging");
         $$0.f = -1L;
         $$0.j = Collections.emptyList();
         $$5.a(new abq() {
            private boolean f;
            private boolean g;
            private long h;

            @Override
            public void a(abs $$0x) {
               if (this.g) {
                  $$5.a(sw.c("multiplayer.status.unrequested"));
               } else {
                  this.g = true;
                  abt $$1 = $$0.a();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = sw.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = sw.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = fff.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<sw> $$2 = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3 : $$1xxx.c()) {
                           $$2.add(sw.b($$3.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2.add(sw.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.j = $$2;
                     } else {
                        $$0.j = List.of();
                     }
                  }, () -> $$0.c = sw.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2 -> {
                     if (!Arrays.equals($$2.a(), $$0.c())) {
                        $$0.a($$2.a());
                        $$1.run();
                     }
                  });
                  this.h = ac.b();
                  $$5.a(new abv(this.h));
                  this.f = true;
               }
            }

            @Override
            public void a(abr $$0x) {
               long $$1 = this.h;
               long $$2 = ac.b();
               $$0.f = $$2 - $$1;
               $$5.a(sw.c("multiplayer.status.finished"));
            }

            @Override
            public void a(sw $$0x) {
               if (!this.f) {
                  fff.this.a($$0, $$0);
                  fff.this.a($$4, $$0);
               }
            }

            @Override
            public boolean a() {
               return $$5.h();
            }
         });

         try {
            $$5.a(new abb($$2.a(), $$2.b(), se.c));
            $$5.a(new abw());
         } catch (Throwable var8) {
            b.error("Failed to ping server {}", $$2, var8);
         }
      }
   }

   void a(sw $$0, ffd $$1) {
      b.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = c;
      $$1.c = sv.a;
   }

   void a(final InetSocketAddress $$0, final ffd $$1) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)sd.f.a())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0x) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new SimpleChannelInboundHandler<ByteBuf>() {
               public void channelActive(ChannelHandlerContext $$0x) throws Exception {
                  super.channelActive($$0);
                  ByteBuf $$1 = Unpooled.buffer();

                  try {
                     $$1.writeByte(254);
                     $$1.writeByte(1);
                     $$1.writeByte(250);
                     char[] $$2 = "MC|PingHost".toCharArray();
                     $$1.writeShort($$2.length);

                     for (char $$3 : $$2) {
                        $$1.writeChar($$3);
                     }

                     $$1.writeShort(7 + 2 * $$0.getHostName().length());
                     $$1.writeByte(127);
                     $$2 = $$0.getHostName().toCharArray();
                     $$1.writeShort($$2.length);

                     for (char $$4 : $$2) {
                        $$1.writeChar($$4);
                     }

                     $$1.writeInt($$0.getPort());
                     $$0.channel().writeAndFlush($$1).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
                  } finally {
                     $$1.release();
                  }
               }

               protected void a(ChannelHandlerContext $$0x, ByteBuf $$1x) {
                  short $$2 = $$1.readUnsignedByte();
                  if ($$2 == 255) {
                     String $$3 = new String($$1.readBytes($$1.readShort() * 2).array(), StandardCharsets.UTF_16BE);
                     String[] $$4 = (String[])Iterables.toArray(fff.a.split($$3), String.class);
                     if ("§1".equals($$4[0])) {
                        int $$5 = apa.a($$4[1], 0);
                        String $$6 = $$4[2];
                        String $$7 = $$4[3];
                        int $$8 = apa.a($$4[4], -1);
                        int $$9 = apa.a($$4[5], -1);
                        $$1.g = -1;
                        $$1.h = sw.b($$6);
                        $$1.d = sw.b($$7);
                        $$1.c = fff.a($$8, $$9);
                        $$1.e = new abt.b($$9, $$8, List.of());
                     }
                  }

                  $$0.close();
               }

               public void exceptionCaught(ChannelHandlerContext $$0x, Throwable $$1x) {
                  $$0.close();
               }
            }});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   static sw a(int $$0, int $$1) {
      return sw.b(Integer.toString($$0)).b(sw.b("/").a(n.i)).f(Integer.toString($$1)).a(n.h);
   }

   public void a() {
      synchronized (this.d) {
         Iterator<sd> $$0 = this.d.iterator();

         while ($$0.hasNext()) {
            sd $$1 = $$0.next();
            if ($$1.h()) {
               $$1.a();
            } else {
               $$0.remove();
               $$1.m();
            }
         }
      }
   }

   public void b() {
      synchronized (this.d) {
         Iterator<sd> $$0 = this.d.iterator();

         while ($$0.hasNext()) {
            sd $$1 = $$0.next();
            if ($$1.h()) {
               $$0.remove();
               $$1.a(sw.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
