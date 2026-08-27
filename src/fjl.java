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

public class fjl {
   private static final Logger a = LogUtils.getLogger();
   private static final tn b = tn.c("multiplayer.status.cannot_connect").a($$0 -> $$0.a(-65536));
   private final List<so> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final fjj $$0, final Runnable $$1) throws UnknownHostException {
      final fkk $$2 = fkk.a($$0.b);
      Optional<InetSocketAddress> $$3 = fkm.a.a($$2).map(fkj::d);
      if ($$3.isEmpty()) {
         this.a(exg.b, $$0);
      } else {
         final InetSocketAddress $$4 = $$3.get();
         final so $$5 = so.a($$4, false, null);
         this.c.add($$5);
         $$0.d = tn.c("multiplayer.status.pinging");
         $$0.f = -1L;
         $$0.j = Collections.emptyList();
         ady $$6 = new ady() {
            private boolean g;
            private boolean h;
            private long i;

            @Override
            public void a(aea $$0x) {
               if (this.h) {
                  $$5.a(tn.c("multiplayer.status.unrequested"));
               } else {
                  this.h = true;
                  aeb $$1 = $$0.a();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = tn.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = tn.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = fjl.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<tn> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3 : $$1xxx.c()) {
                           $$2xx.add(tn.b($$3.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(tn.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.j = $$2xx;
                     } else {
                        $$0.j = List.of();
                     }
                  }, () -> $$0.c = tn.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(fjj.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.i = ac.b();
                  $$5.a(new aed(this.i));
                  this.g = true;
               }
            }

            @Override
            public void a(adz $$0x) {
               long $$1 = this.i;
               long $$2 = ac.b();
               $$0.f = $$2 - $$1;
               $$5.a(tn.c("multiplayer.status.finished"));
            }

            @Override
            public void a(tn $$0x) {
               if (!this.g) {
                  fjl.this.a($$0, $$0);
                  fjl.this.a($$4, $$2, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$5.k();
            }
         };

         try {
            $$5.a($$2.a(), $$2.b(), $$6);
            $$5.a(new aee());
         } catch (Throwable var9) {
            a.error("Failed to ping server {}", $$2, var9);
         }
      }
   }

   void a(tn $$0, fjj $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = tm.a;
   }

   void a(InetSocketAddress $$0, final fkk $$1, final fjj $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)so.g.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new fje($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.g = -1;
               $$2.h = tn.b($$2xx);
               $$2.d = tn.b($$3);
               $$2.c = fjl.a($$4, $$5);
               $$2.e = new aeb.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static tn a(int $$0, int $$1) {
      tn $$2 = tn.b(Integer.toString($$0)).a(n.h);
      tn $$3 = tn.b(Integer.toString($$1)).a(n.h);
      return tn.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<so> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            so $$1 = $$0.next();
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
         Iterator<so> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            so $$1 = $$0.next();
            if ($$1.k()) {
               $$0.remove();
               $$1.a(tn.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
