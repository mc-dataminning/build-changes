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

public class fdy extends gwo {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int B = 80;
   private static final int C = 95;
   private static final int D = 1;
   private final fob E;
   private final fdb F;
   private final wz G;
   private final RateLimiter H;
   private fik I;
   private final String J;
   private final fdy.a K;
   @Nullable
   private volatile wz L;
   private volatile wz M = wz.c("mco.download.preparing");
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

   public fdy(fob $$0, fdb $$1, String $$2, BooleanConsumer $$3) {
      super(fge.a);
      this.Z = $$3;
      this.E = $$0;
      this.J = $$2;
      this.F = $$1;
      this.K = new fdy.a();
      this.G = wz.c("mco.download.title");
      this.H = RateLimiter.create(0.1F);
   }

   @Override
   public void aT_() {
      this.I = this.c(fik.a(wy.e, $$0 -> this.d()).a((this.m - 200) / 2, this.n - 42, 200, 20).a());
      this.C();
   }

   private void C() {
      if (!this.Q && !this.Y) {
         this.Y = true;
         if (this.a(this.F.a) >= 5368709120L) {
            wz $$0 = wz.a("mco.download.confirmation.oversized", fbs.b(5368709120L));
            this.l.a(feh.c(this, $$0, $$0x -> {
               this.l.a(this);
               this.E();
            }));
         } else {
            this.E();
         }
      }
   }

   private long a(String $$0) {
      fbt $$1 = new fbt();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      if (this.M != null && this.H.tryAcquire(1)) {
         wz $$0 = this.D();
         this.l.aV().c($$0);
      }
   }

   private wz D() {
      List<wz> $$0 = Lists.newArrayList();
      $$0.add(this.G);
      $$0.add(this.M);
      if (this.N != null) {
         $$0.add(wz.a("mco.download.percent", this.N));
         $$0.add(wz.a("mco.download.speed.narration", fbs.b(this.U)));
      }

      if (this.L != null) {
         $$0.add(this.L);
      }

      return wy.a($$0);
   }

   @Override
   public void d() {
      this.O = true;
      if (this.Q && this.Z != null && this.L == null) {
         this.Z.accept(true);
      }

      this.l.a(this.E);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.G, this.m / 2, 20, -1);
      $$0.a(this.o, this.M, this.m / 2, 50, -1);
      if (this.P) {
         this.c($$0);
      }

      if (this.K.a != 0L && !this.O) {
         this.d($$0);
         this.e($$0);
      }

      if (this.L != null) {
         $$0.a(this.o, this.L, this.m / 2, 110, -65536);
      }
   }

   private void c(fhx $$0) {
      int $$1 = this.o.a(this.M);
      if (this.V != 0 && this.V % 10 == 0) {
         this.X++;
      }

      $$0.a(this.o, W[this.X % W.length], this.m / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(fhx $$0) {
      double $$1 = Math.min((double)this.K.a / (double)this.K.b, 1.0);
      this.N = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.m - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.o, wz.a("mco.download.percent", this.N), this.m / 2, 84, -1);
   }

   private void e(fhx $$0) {
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

   private void a(fhx $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.o.b(this.N);
         $$0.a(this.o, wz.a("mco.download.speed", fbs.b($$1)), this.m / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void E() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.M = wz.c("mco.download.failed");
                  return;
               }

               if (this.O) {
                  this.F();
                  return;
               }

               this.M = wz.a("mco.download.downloading", this.J);
               fbt $$0 = new fbt();
               $$0.a(this.F.a);
               $$0.a(this.F, this.J, this.K, this.l.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.L = wz.c("mco.download.failed");
                     this.I.b(wy.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.R) {
                        this.M = wz.c("mco.download.extracting");
                     }

                     this.R = true;
                  }

                  if (this.O) {
                     $$0.a();
                     this.F();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.Q = true;
               this.M = wz.c("mco.download.done");
               this.I.b(wy.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.L = wz.c("mco.download.failed");
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

   private void F() {
      this.M = wz.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
