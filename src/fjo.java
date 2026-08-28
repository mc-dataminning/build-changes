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

public class fjo extends hhs {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int C = 80;
   private static final int D = 95;
   private static final int E = 1;
   private final ftr F;
   private final fir G;
   private final xk H;
   private final RateLimiter I;
   private fny J;
   private final String K;
   private final fjo.a L;
   @Nullable
   private volatile xk M;
   private volatile xk N = xk.c("mco.download.preparing");
   @Nullable
   private volatile String O;
   private volatile boolean P;
   private volatile boolean Q = true;
   private volatile boolean R;
   private volatile boolean S;
   @Nullable
   private Long T;
   @Nullable
   private Long U;
   private long V;
   private int W;
   private static final String[] X = new String[]{"", ".", ". .", ". . ."};
   private int Y;
   private boolean Z;
   private final BooleanConsumer aa;

   public fjo(ftr $$0, fir $$1, String $$2, BooleanConsumer $$3) {
      super(flq.a);
      this.aa = $$3;
      this.F = $$0;
      this.K = $$2;
      this.G = $$1;
      this.L = new fjo.a();
      this.H = xk.c("mco.download.title");
      this.I = RateLimiter.create(0.1F);
   }

   @Override
   public void aT_() {
      this.J = this.c(fny.a(xj.e, $$0 -> this.aP_()).a((this.n - 200) / 2, this.o - 42, 200, 20).a());
      this.E();
   }

   private void E() {
      if (!this.R && !this.Z) {
         this.Z = true;
         if (this.a(this.G.a) >= 5368709120L) {
            xk $$0 = xk.a("mco.download.confirmation.oversized", fgx.b(5368709120L));
            this.m.a(fjx.c(this, $$0, $$0x -> {
               this.m.a(this);
               this.G();
            }));
         } else {
            this.G();
         }
      }
   }

   private long a(String $$0) {
      fgy $$1 = new fgy();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.W++;
      if (this.N != null && this.I.tryAcquire(1)) {
         xk $$0 = this.F();
         this.m.aZ().c($$0);
      }
   }

   private xk F() {
      List<xk> $$0 = Lists.newArrayList();
      $$0.add(this.H);
      $$0.add(this.N);
      if (this.O != null) {
         $$0.add(xk.a("mco.download.percent", this.O));
         $$0.add(xk.a("mco.download.speed.narration", fgx.b(this.V)));
      }

      if (this.M != null) {
         $$0.add(this.M);
      }

      return xj.a($$0);
   }

   @Override
   public void aP_() {
      this.P = true;
      if (this.R && this.aa != null && this.M == null) {
         this.aa.accept(true);
      }

      this.m.a(this.F);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.H, this.n / 2, 20, -1);
      $$0.a(this.p, this.N, this.n / 2, 50, -1);
      if (this.Q) {
         this.c($$0);
      }

      if (this.L.a != 0L && !this.P) {
         this.d($$0);
         this.e($$0);
      }

      if (this.M != null) {
         $$0.a(this.p, this.M, this.n / 2, 110, -65536);
      }
   }

   private void c(fnl $$0) {
      int $$1 = this.p.a(this.N);
      if (this.W != 0 && this.W % 10 == 0) {
         this.Y++;
      }

      $$0.b(this.p, X[this.Y % X.length], this.n / 2 + $$1 / 2 + 5, 50, -1);
   }

   private void d(fnl $$0) {
      double $$1 = Math.min((double)this.L.a / (double)this.L.b, 1.0);
      this.O = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, xk.a("mco.download.percent", this.O), this.n / 2, 84, -1);
   }

   private void e(fnl $$0) {
      if (this.W % 20 == 0) {
         if (this.T != null) {
            long $$1 = ae.c() - this.U;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.V = 1000L * (this.L.a - this.T) / $$1;
            this.a($$0, this.V);
         }

         this.T = this.L.a;
         this.U = ae.c();
      } else {
         this.a($$0, this.V);
      }
   }

   private void a(fnl $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.p.b(this.O);
         $$0.b(this.p, xk.a("mco.download.speed", fgx.b($$1)), this.n / 2 + $$2 / 2 + 15, 84, -1);
      }
   }

   private void G() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.N = xk.c("mco.download.failed");
                  return;
               }

               if (this.P) {
                  this.J();
                  return;
               }

               this.N = xk.a("mco.download.downloading", this.K);
               fgy $$0 = new fgy();
               $$0.a(this.G.a);
               $$0.a(this.G, this.K, this.L, this.m.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.M = xk.c("mco.download.failed");
                     this.J.b(xj.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.S) {
                        this.N = xk.c("mco.download.extracting");
                     }

                     this.S = true;
                  }

                  if (this.P) {
                     $$0.a();
                     this.J();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.R = true;
               this.N = xk.c("mco.download.done");
               this.J.b(xj.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.M = xk.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.Q = false;
               this.R = true;
            }
         }
      }).start();
   }

   private void J() {
      this.N = xk.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
