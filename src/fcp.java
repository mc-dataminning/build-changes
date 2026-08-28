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

public class fcp extends gve {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int B = 80;
   private static final int C = 95;
   private static final int D = 1;
   private final fnb E;
   private final fbt F;
   private final xo G;
   private final RateLimiter H;
   private fhc I;
   private final String J;
   private final fcp.a K;
   @Nullable
   private volatile xo L;
   private volatile xo M = xo.c("mco.download.preparing");
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

   public fcp(fnb $$0, fbt $$1, String $$2, BooleanConsumer $$3) {
      super(fev.a);
      this.Z = $$3;
      this.E = $$0;
      this.J = $$2;
      this.F = $$1;
      this.K = new fcp.a();
      this.G = xo.c("mco.download.title");
      this.H = RateLimiter.create(0.1F);
   }

   @Override
   public void aM_() {
      this.I = this.c(fhc.a(xn.e, $$0 -> {
         this.O = true;
         this.F();
      }).a((this.n - 200) / 2, this.o - 42, 200, 20).a());
      this.D();
   }

   private void D() {
      if (!this.Q) {
         if (!this.Y && this.a(this.F.a) >= 5368709120L) {
            xo $$0 = xo.a("mco.download.confirmation.line1", fai.b(5368709120L));
            xo $$1 = xo.c("mco.download.confirmation.line2");
            this.m.a(new fcs($$0x -> {
               this.Y = true;
               this.m.a(this);
               this.I();
            }, fcs.a.a, $$0, $$1, false));
         } else {
            this.I();
         }
      }
   }

   private long a(String $$0) {
      faj $$1 = new faj();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      if (this.M != null && this.H.tryAcquire(1)) {
         xo $$0 = this.E();
         this.m.aX().c($$0);
      }
   }

   private xo E() {
      List<xo> $$0 = Lists.newArrayList();
      $$0.add(this.G);
      $$0.add(this.M);
      if (this.N != null) {
         $$0.add(xo.a("mco.download.percent", this.N));
         $$0.add(xo.a("mco.download.speed.narration", fai.b(this.U)));
      }

      if (this.L != null) {
         $$0.add(this.L);
      }

      return xn.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.O = true;
         this.F();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void F() {
      if (this.Q && this.Z != null && this.L == null) {
         this.Z.accept(true);
      }

      this.m.a(this.E);
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
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

   private void c(fgp $$0) {
      int $$1 = this.p.a(this.M);
      if (this.V % 10 == 0) {
         this.X++;
      }

      $$0.a(this.p, W[this.X % W.length], this.n / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(fgp $$0) {
      double $$1 = Math.min((double)this.K.a / (double)this.K.b, 1.0);
      this.N = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, xo.a("mco.download.percent", this.N), this.n / 2, 84, -1);
   }

   private void e(fgp $$0) {
      if (this.V % 20 == 0) {
         if (this.S != null) {
            long $$1 = ac.c() - this.T;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.U = 1000L * (this.K.a - this.S) / $$1;
            this.a($$0, this.U);
         }

         this.S = this.K.a;
         this.T = ac.c();
      } else {
         this.a($$0, this.U);
      }
   }

   private void a(fgp $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.p.b(this.N);
         $$0.a(this.p, xo.a("mco.download.speed", fai.b($$1)), this.n / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void I() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.M = xo.c("mco.download.failed");
                  return;
               }

               if (this.O) {
                  this.J();
                  return;
               }

               this.M = xo.a("mco.download.downloading", this.J);
               faj $$0 = new faj();
               $$0.a(this.F.a);
               $$0.a(this.F, this.J, this.K, this.m.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.L = xo.c("mco.download.failed");
                     this.I.b(xn.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.R) {
                        this.M = xo.c("mco.download.extracting");
                     }

                     this.R = true;
                  }

                  if (this.O) {
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

               this.Q = true;
               this.M = xo.c("mco.download.done");
               this.I.b(xn.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.L = xo.c("mco.download.failed");
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

   private void J() {
      this.M = xo.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
