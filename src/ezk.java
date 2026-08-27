import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezk extends gru {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int y = 80;
   private static final int z = 95;
   private static final int A = 1;
   private final fjx B;
   private final eyo C;
   private final wi D;
   private final RateLimiter E;
   private fdy F;
   private final String G;
   private final ezk.a H;
   @Nullable
   private volatile wi I;
   private volatile wi J = wi.c("mco.download.preparing");
   @Nullable
   private volatile String K;
   private volatile boolean L;
   private volatile boolean M = true;
   private volatile boolean N;
   private volatile boolean O;
   @Nullable
   private Long P;
   @Nullable
   private Long Q;
   private long R;
   private int S;
   private static final String[] T = new String[]{"", ".", ". .", ". . ."};
   private int U;
   private boolean V;
   private final BooleanConsumer W;

   public ezk(fjx $$0, eyo $$1, String $$2, BooleanConsumer $$3) {
      super(fbq.a);
      this.W = $$3;
      this.B = $$0;
      this.G = $$2;
      this.C = $$1;
      this.H = new ezk.a();
      this.D = wi.c("mco.download.title");
      this.E = RateLimiter.create(0.1F);
   }

   @Override
   public void aM_() {
      this.F = this.c(fdy.a(wh.e, $$0 -> {
         this.L = true;
         this.E();
      }).a((this.k - 200) / 2, this.l - 42, 200, 20).a());
      this.C();
   }

   private void C() {
      if (!this.N) {
         if (!this.V && this.a(this.C.a) >= 5368709120L) {
            wi $$0 = wi.a("mco.download.confirmation.line1", exd.b(5368709120L));
            wi $$1 = wi.c("mco.download.confirmation.line2");
            this.j.a(new ezn($$0x -> {
               this.V = true;
               this.j.a(this);
               this.F();
            }, ezn.a.a, $$0, $$1, false));
         } else {
            this.F();
         }
      }
   }

   private long a(String $$0) {
      exe $$1 = new exe();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.S++;
      if (this.J != null && this.E.tryAcquire(1)) {
         wi $$0 = this.D();
         this.j.aY().c($$0);
      }
   }

   private wi D() {
      List<wi> $$0 = Lists.newArrayList();
      $$0.add(this.D);
      $$0.add(this.J);
      if (this.K != null) {
         $$0.add(wi.a("mco.download.percent", this.K));
         $$0.add(wi.a("mco.download.speed.narration", exd.b(this.R)));
      }

      if (this.I != null) {
         $$0.add(this.I);
      }

      return wh.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.L = true;
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.N && this.W != null && this.I == null) {
         this.W.accept(true);
      }

      this.j.a(this.B);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.D, this.k / 2, 20, -1);
      $$0.a(this.m, this.J, this.k / 2, 50, -1);
      if (this.M) {
         this.c($$0);
      }

      if (this.H.a != 0L && !this.L) {
         this.d($$0);
         this.e($$0);
      }

      if (this.I != null) {
         $$0.a(this.m, this.I, this.k / 2, 110, -65536);
      }
   }

   private void c(fdl $$0) {
      int $$1 = this.m.a(this.J);
      if (this.S % 10 == 0) {
         this.U++;
      }

      $$0.a(this.m, T[this.U % T.length], this.k / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(fdl $$0) {
      double $$1 = Math.min((double)this.H.a / (double)this.H.b, 1.0);
      this.K = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.k - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.m, wi.a("mco.download.percent", this.K), this.k / 2, 84, -1);
   }

   private void e(fdl $$0) {
      if (this.S % 20 == 0) {
         if (this.P != null) {
            long $$1 = ac.b() - this.Q;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.R = 1000L * (this.H.a - this.P) / $$1;
            this.a($$0, this.R);
         }

         this.P = this.H.a;
         this.Q = ac.b();
      } else {
         this.a($$0, this.R);
      }
   }

   private void a(fdl $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.m.b(this.K);
         $$0.a(this.m, wi.a("mco.download.speed", exd.b($$1)), this.k / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void F() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.J = wi.c("mco.download.failed");
                  return;
               }

               if (this.L) {
                  this.I();
                  return;
               }

               this.J = wi.a("mco.download.downloading", this.G);
               exe $$0 = new exe();
               $$0.a(this.C.a);
               $$0.a(this.C, this.G, this.H, this.j.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.I = wi.c("mco.download.failed");
                     this.F.b(wh.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.O) {
                        this.J = wi.c("mco.download.extracting");
                     }

                     this.O = true;
                  }

                  if (this.L) {
                     $$0.a();
                     this.I();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.N = true;
               this.J = wi.c("mco.download.done");
               this.F.b(wh.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.I = wi.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.M = false;
               this.N = true;
            }
         }
      }).start();
   }

   private void I() {
      this.J = wi.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
