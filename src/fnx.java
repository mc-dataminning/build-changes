import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fnx {
   private static final Logger a = LogUtils.getLogger();
   private static final vd b = vd.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<ue> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final fnv $$0, final Runnable $$1) throws UnknownHostException {
      final fox $$2 = fox.a($$0.b);
      Optional<InetSocketAddress> $$3 = foz.a.a($$2).map(fow::d);
      if ($$3.isEmpty()) {
         this.a(fbn.b, $$0);
      } else {
         final InetSocketAddress $$4 = $$3.get();
         final ue $$5 = ue.a($$4, false, null);
         this.c.add($$5);
         $$0.d = vd.c("multiplayer.status.pinging");
         $$0.f = -1L;
         $$0.j = Collections.emptyList();
         agb $$6 = new agb() {
            private boolean g;
            private boolean h;
            private long i;

            @Override
            public void a(agd $$0x) {
               if (this.h) {
                  $$5.a(vd.c("multiplayer.status.unrequested"));
               } else {
                  this.h = true;
                  age $$1 = $$0.a();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = vd.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = vd.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = fnx.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<vd> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3 : $$1xxx.c()) {
                           $$2xx.add(vd.b($$3.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(vd.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.j = $$2xx;
                     } else {
                        $$0.j = List.of();
                     }
                  }, () -> $$0.c = vd.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(fnv.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.i = ac.b();
                  $$5.a(new agg(this.i));
                  this.g = true;
               }
            }

            @Override
            public void a(agc $$0x) {
               long $$1 = this.i;
               long $$2 = ac.b();
               $$0.f = $$2 - $$1;
               $$5.a(vd.c("multiplayer.status.finished"));
            }

            @Override
            public void a(vd $$0x) {
               if (!this.g) {
                  fnx.this.a($$0, $$0);
                  fnx.this.a($$4, $$2, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$5.k();
            }
         };

         try {
            $$5.a($$2.a(), $$2.b(), $$6);
            $$5.a(new agh());
         } catch (Throwable var9) {
            a.error("Failed to ping server {}", $$2, var9);
         }
      }
   }

   void a(vd $$0, fnv $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = vc.a;
   }

   void a(InetSocketAddress $$0, final fox $$1, final fnv $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)ue.g.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new fnp($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.g = -1;
               $$2.h = vd.b($$2xx);
               $$2.d = vd.b($$3);
               $$2.c = fnx.a($$4, $$5);
               $$2.e = new age.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static vd a(int $$0, int $$1) {
      vd $$2 = vd.b(Integer.toString($$0)).a(n.h);
      vd $$3 = vd.b(Integer.toString($$1)).a(n.h);
      return vd.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<ue> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            ue $$1 = $$0.next();
            if ($$1.k()) {
               $$1.d();
            } else {
               $$0.remove();
               $$1.p();
            }
         }
      }
   }

   public void b() {
      synchronized (this.c) {
         Iterator<ue> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            ue $$1 = $$0.next();
            if ($$1.k()) {
               $$0.remove();
               $$1.a(vd.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
