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

public class fdg extends gvs {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int A = 80;
   private static final int B = 95;
   private static final int C = 1;
   private final fnj D;
   private final fcj E;
   private final wu F;
   private final RateLimiter G;
   private fhs H;
   private final String I;
   private final fdg.a J;
   @Nullable
   private volatile wu K;
   private volatile wu L = wu.c("mco.download.preparing");
   @Nullable
   private volatile String M;
   private volatile boolean N;
   private volatile boolean O = true;
   private volatile boolean P;
   private volatile boolean Q;
   @Nullable
   private Long R;
   @Nullable
   private Long S;
   private long T;
   private int U;
   private static final String[] V = new String[]{"", ".", ". .", ". . ."};
   private int W;
   private boolean X;
   private final BooleanConsumer Y;

   public fdg(fnj $$0, fcj $$1, String $$2, BooleanConsumer $$3) {
      super(ffl.a);
      this.Y = $$3;
      this.D = $$0;
      this.I = $$2;
      this.E = $$1;
      this.J = new fdg.a();
      this.F = wu.c("mco.download.title");
      this.G = RateLimiter.create(0.1F);
   }

   @Override
   public void aP_() {
      this.H = this.c(fhs.a(wt.e, $$0 -> this.d()).a((this.m - 200) / 2, this.n - 42, 200, 20).a());
      this.E();
   }

   private void E() {
      if (!this.P && !this.X) {
         this.X = true;
         if (this.a(this.E.a) >= 5368709120L) {
            wu $$0 = wu.a("mco.download.confirmation.oversized", fay.b(5368709120L));
            this.l.a(fdp.c(this, $$0, $$0x -> {
               this.l.a(this);
               this.G();
            }));
         } else {
            this.G();
         }
      }
   }

   private long a(String $$0) {
      faz $$1 = new faz();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.U++;
      if (this.L != null && this.G.tryAcquire(1)) {
         wu $$0 = this.F();
         this.l.aX().c($$0);
      }
   }

   private wu F() {
      List<wu> $$0 = Lists.newArrayList();
      $$0.add(this.F);
      $$0.add(this.L);
      if (this.M != null) {
         $$0.add(wu.a("mco.download.percent", this.M));
         $$0.add(wu.a("mco.download.speed.narration", fay.b(this.T)));
      }

      if (this.K != null) {
         $$0.add(this.K);
      }

      return wt.a($$0);
   }

   @Override
   public void d() {
      this.N = true;
      if (this.P && this.Y != null && this.K == null) {
         this.Y.accept(true);
      }

      this.l.a(this.D);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.F, this.m / 2, 20, -1);
      $$0.a(this.o, this.L, this.m / 2, 50, -1);
      if (this.O) {
         this.c($$0);
      }

      if (this.J.a != 0L && !this.N) {
         this.d($$0);
         this.e($$0);
      }

      if (this.K != null) {
         $$0.a(this.o, this.K, this.m / 2, 110, -65536);
      }
   }

   private void c(fhf $$0) {
      int $$1 = this.o.a(this.L);
      if (this.U != 0 && this.U % 10 == 0) {
         this.W++;
      }

      $$0.a(this.o, V[this.W % V.length], this.m / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(fhf $$0) {
      double $$1 = Math.min((double)this.J.a / (double)this.J.b, 1.0);
      this.M = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.m - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.o, wu.a("mco.download.percent", this.M), this.m / 2, 84, -1);
   }

   private void e(fhf $$0) {
      if (this.U % 20 == 0) {
         if (this.R != null) {
            long $$1 = ac.c() - this.S;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.T = 1000L * (this.J.a - this.R) / $$1;
            this.a($$0, this.T);
         }

         this.R = this.J.a;
         this.S = ac.c();
      } else {
         this.a($$0, this.T);
      }
   }

   private void a(fhf $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.o.b(this.M);
         $$0.a(this.o, wu.a("mco.download.speed", fay.b($$1)), this.m / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void G() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.L = wu.c("mco.download.failed");
                  return;
               }

               if (this.N) {
                  this.J();
                  return;
               }

               this.L = wu.a("mco.download.downloading", this.I);
               faz $$0 = new faz();
               $$0.a(this.E.a);
               $$0.a(this.E, this.I, this.J, this.l.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.K = wu.c("mco.download.failed");
                     this.H.b(wt.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.Q) {
                        this.L = wu.c("mco.download.extracting");
                     }

                     this.Q = true;
                  }

                  if (this.N) {
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

               this.P = true;
               this.L = wu.c("mco.download.done");
               this.H.b(wt.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.K = wu.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.O = false;
               this.P = true;
            }
         }
      }).start();
   }

   private void J() {
      this.L = wu.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
