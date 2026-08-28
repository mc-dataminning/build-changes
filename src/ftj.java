import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftj extends fuk {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wo a = wo.c("connect.aborted");
   public static final wo b = wo.a("disconnect.genericReason", wo.c("disconnect.unknownHost"));
   @Nullable
   volatile vi u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fuk x;
   private wo y = wo.c("connect.connecting");
   private long z = -1L;
   final wo A;

   private ftj(fuk $$0, wo $$1) {
      super(fla.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fuk $$0, flj $$1, ghq $$2, ggn $$3, boolean $$4, @Nullable ggr $$5) {
      if ($$1.z instanceof ftj) {
         d.error("Attempt to connect while already connecting");
      } else {
         wo $$6;
         if ($$5 != null) {
            $$6 = wn.q;
         } else if ($$4) {
            $$6 = glc.a;
         } else {
            $$6 = wn.r;
         }

         ftj $$9 = new ftj($$0, $$6);
         if ($$5 != null) {
            $$9.a(wo.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(ghe.a($$3.b));
         $$1.bc().a(gld.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final flj $$0, final ghq $$1, final ggn $$2, @Nullable final ggr $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ftj.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ghs.a.a($$1).map(ghp::d);
               if (ftj.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new ftr(ftj.this.x, ftj.this.A, ftj.b)));
                  return;
               }

               $$0 = $$1.get();
               vi $$2;
               synchronized (ftj.this) {
                  if (ftj.this.w) {
                     return;
                  }

                  $$2 = new vi(yw.b);
                  $$2.a($$0.aQ().n());
                  ftj.this.v = vi.a($$0, $$0.n.aD(), $$2);
               }

               ftj.this.v.syncUninterruptibly();
               synchronized (ftj.this) {
                  if (ftj.this.w) {
                     $$2.a(ftj.a);
                     return;
                  }

                  ftj.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               ftj.this.u
                  .a($$0.getHostName(), $$0.getPort(), aiw.b, aiw.d, new gfx(ftj.this.u, $$0, $$2, ftj.this.x, false, null, ftj.this::a, $$3), $$3 != null);
               ftj.this.u.a(new aiz($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (ftj.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ftj.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ftr(ftj.this.x, ftj.this.A, wo.a("disconnect.genericReason", $$8))));
            }
         }

         private static hho.c a(ggn.a $$0x) {
            return switch ($$0) {
               case a -> hho.c.b;
               case b -> hho.c.c;
               case c -> hho.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wo $$0) {
      this.y = $$0;
   }

   @Override
   public void e() {
      if (this.u != null) {
         if (this.u.i()) {
            this.u.b();
         } else {
            this.u.n();
         }
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
      this.c(fos.a(wn.e, $$0 -> {
         synchronized (this) {
            this.w = true;
            if (this.v != null) {
               this.v.cancel(true);
               this.v = null;
            }

            if (this.u != null) {
               this.u.a(a);
            }
         }

         this.m.a(this.x);
      }).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wo.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
