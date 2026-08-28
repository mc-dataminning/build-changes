import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpr extends fqs {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xh a = xh.c("connect.aborted");
   public static final xh b = xh.a("disconnect.genericReason", xh.c("disconnect.unknownHost"));
   @Nullable
   volatile wb u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fqs x;
   private xh y = xh.c("connect.connecting");
   private long z = -1L;
   final xh A;

   private fpr(fqs $$0, xh $$1) {
      super(fir.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fqs $$0, fja $$1, gdo $$2, gcl $$3, boolean $$4, @Nullable gcp $$5) {
      if ($$1.z instanceof fpr) {
         d.error("Attempt to connect while already connecting");
      } else {
         xh $$6;
         if ($$5 != null) {
            $$6 = xg.q;
         } else if ($$4) {
            $$6 = ggz.a;
         } else {
            $$6 = xg.r;
         }

         fpr $$9 = new fpr($$0, $$6);
         if ($$5 != null) {
            $$9.a(xh.c("connect.transferring"));
         }

         $$1.y();
         $$1.aW();
         $$1.a(gdc.a($$3.b));
         $$1.be().a(gha.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fja $$0, final gdo $$1, final gcl $$2, @Nullable final gcp $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fpr.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gdq.a.a($$1).map(gdn::d);
               if (fpr.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fpz(fpr.this.x, fpr.this.A, fpr.b)));
                  return;
               }

               $$0 = $$1.get();
               wb $$2;
               synchronized (fpr.this) {
                  if (fpr.this.w) {
                     return;
                  }

                  $$2 = new wb(zp.b);
                  $$2.a($$0.aR().n());
                  fpr.this.v = wb.a($$0, $$0.n.aC(), $$2);
               }

               fpr.this.v.syncUninterruptibly();
               synchronized (fpr.this) {
                  if (fpr.this.w) {
                     $$2.a(fpr.a);
                     return;
                  }

                  fpr.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fpr.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajj.b, ajj.d, new gbw(fpr.this.u, $$0, $$2, fpr.this.x, false, null, fpr.this::a, $$3), $$3 != null);
               fpr.this.u.a(new ajm($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fpr.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fpr.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fpz(fpr.this.x, fpr.this.A, xh.a("disconnect.genericReason", $$8))));
            }
         }

         private static hav.c a(gcl.a $$0x) {
            return switch ($$0) {
               case a -> hav.c.b;
               case b -> hav.c.c;
               case c -> hav.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xh $$0) {
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
   public boolean aI_() {
      return false;
   }

   @Override
   protected void aS_() {
      this.c(fkz.a(xg.e, $$0 -> {
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
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.ba().c(xh.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
