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

public class fos {
   private static final Logger a = LogUtils.getLogger();
   private static final vg b = vg.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<uh> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final fop $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final fpr $$3 = fpr.a($$0.b);
      Optional<InetSocketAddress> $$4 = fpt.a.a($$3).map(fpq::d);
      if ($$4.isEmpty()) {
         this.a(fcg.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final uh $$6 = uh.a($$5, false, null);
         this.c.add($$6);
         $$0.d = vg.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         agf $$7 = new agf() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(agh $$0x) {
               if (this.i) {
                  $$6.a(vg.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  agi $$1 = $$0.a();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = vg.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = vg.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = fos.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<vg> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(vg.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(vg.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = vg.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(fop.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = ac.b();
                  $$6.a(new agk(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(agg $$0x) {
               long $$1 = this.j;
               long $$2 = ac.b();
               $$0.f = $$2 - $$1;
               $$6.a(vg.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(vg $$0x) {
               if (!this.h) {
                  fos.this.a($$0, $$0);
                  fos.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.k();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(new agl());
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(vg $$0, fop $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = vf.a;
   }

   void a(InetSocketAddress $$0, final fpr $$1, final fop $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)uh.g.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new foj($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(fop.b.d);
               $$2.h = vg.b($$2xx);
               $$2.d = vg.b($$3);
               $$2.c = fos.a($$4, $$5);
               $$2.e = new agi.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static vg a(int $$0, int $$1) {
      vg $$2 = vg.b(Integer.toString($$0)).a(n.h);
      vg $$3 = vg.b(Integer.toString($$1)).a(n.h);
      return vg.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<uh> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            uh $$1 = $$0.next();
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
         Iterator<uh> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            uh $$1 = $$0.next();
            if ($$1.k()) {
               $$0.remove();
               $$1.a(vg.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
