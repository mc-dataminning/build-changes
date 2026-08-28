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

public class fgl extends hee {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int B = 80;
   private static final int C = 95;
   private static final int D = 1;
   private final fqs E;
   private final ffo F;
   private final xh G;
   private final RateLimiter H;
   private fkz I;
   private final String J;
   private final fgl.a K;
   @Nullable
   private volatile xh L;
   private volatile xh M = xh.c("mco.download.preparing");
   @Nullable
   private volatile String N;
   private volatile boolean O;
   private volatile boolean P = true;
   private volatile boolean Q;
   private volatile boolean R;
   @Nullable
   private Long S;
   @Nullable
   private Long T;
   private long U;
   private int V;
   private static final String[] W = new String[]{"", ".", ". .", ". . ."};
   private int X;
   private boolean Y;
   private final BooleanConsumer Z;

   public fgl(fqs $$0, ffo $$1, String $$2, BooleanConsumer $$3) {
      super(fir.a);
      this.Z = $$3;
      this.E = $$0;
      this.J = $$2;
      this.F = $$1;
      this.K = new fgl.a();
      this.G = xh.c("mco.download.title");
      this.H = RateLimiter.create(0.1F);
   }

   @Override
   public void aS_() {
      this.I = this.c(fkz.a(xg.e, $$0 -> this.d()).a((this.n - 200) / 2, this.o - 42, 200, 20).a());
      this.D();
   }

   private void D() {
      if (!this.Q && !this.Y) {
         this.Y = true;
         if (this.a(this.F.a) >= 5368709120L) {
            xh $$0 = xh.a("mco.download.confirmation.oversized", fef.b(5368709120L));
            this.m.a(fgu.c(this, $$0, $$0x -> {
               this.m.a(this);
               this.F();
            }));
         } else {
            this.F();
         }
      }
   }

   private long a(String $$0) {
      feg $$1 = new feg();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      if (this.M != null && this.H.tryAcquire(1)) {
         xh $$0 = this.E();
         this.m.ba().c($$0);
      }
   }

   private xh E() {
      List<xh> $$0 = Lists.newArrayList();
      $$0.add(this.G);
      $$0.add(this.M);
      if (this.N != null) {
         $$0.add(xh.a("mco.download.percent", this.N));
         $$0.add(xh.a("mco.download.speed.narration", fef.b(this.U)));
      }

      if (this.L != null) {
         $$0.add(this.L);
      }

      return xg.a($$0);
   }

   @Override
   public void d() {
      this.O = true;
      if (this.Q && this.Z != null && this.L == null) {
         this.Z.accept(true);
      }

      this.m.a(this.E);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.G, this.n / 2, 20, -1);
      $$0.a(this.p, this.M, this.n / 2, 50, -1);
      if (this.P) {
         this.c($$0);
      }

      if (this.K.a != 0L && !this.O) {
         this.d($$0);
         this.e($$0);
      }

      if (this.L != null) {
         $$0.a(this.p, this.L, this.n / 2, 110, -65536);
      }
   }

   private void c(fkm $$0) {
      int $$1 = this.p.a(this.M);
      if (this.V != 0 && this.V % 10 == 0) {
         this.X++;
      }

      $$0.a(this.p, W[this.X % W.length], this.n / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(fkm $$0) {
      double $$1 = Math.min((double)this.K.a / (double)this.K.b, 1.0);
      this.N = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, xh.a("mco.download.percent", this.N), this.n / 2, 84, -1);
   }

   private void e(fkm $$0) {
      if (this.V % 20 == 0) {
         if (this.S != null) {
            long $$1 = ad.c() - this.T;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.U = 1000L * (this.K.a - this.S) / $$1;
            this.a($$0, this.U);
         }

         this.S = this.K.a;
         this.T = ad.c();
      } else {
         this.a($$0, this.U);
      }
   }

   private void a(fkm $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.p.b(this.N);
         $$0.a(this.p, xh.a("mco.download.speed", fef.b($$1)), this.n / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void F() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.M = xh.c("mco.download.failed");
                  return;
               }

               if (this.O) {
                  this.G();
                  return;
               }

               this.M = xh.a("mco.download.downloading", this.J);
               feg $$0 = new feg();
               $$0.a(this.F.a);
               $$0.a(this.F, this.J, this.K, this.m.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.L = xh.c("mco.download.failed");
                     this.I.b(xg.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.R) {
                        this.M = xh.c("mco.download.extracting");
                     }

                     this.R = true;
                  }

                  if (this.O) {
                     $$0.a();
                     this.G();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.Q = true;
               this.M = xh.c("mco.download.done");
               this.I.b(xg.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.L = xh.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.P = false;
               this.Q = true;
            }
         }
      }).start();
   }

   private void G() {
      this.M = xh.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
