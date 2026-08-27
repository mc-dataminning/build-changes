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

public class ews extends gpb {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int v = 80;
   private static final int w = 95;
   private static final int x = 1;
   private final fhf y;
   private final evw z;
   private final vu A;
   private final RateLimiter B;
   private fbg C;
   private final String D;
   private final ews.a E;
   @Nullable
   private volatile vu F;
   private volatile vu G = vu.c("mco.download.preparing");
   @Nullable
   private volatile String H;
   private volatile boolean I;
   private volatile boolean J = true;
   private volatile boolean K;
   private volatile boolean L;
   @Nullable
   private Long M;
   @Nullable
   private Long N;
   private long O;
   private int P;
   private static final String[] Q = new String[]{"", ".", ". .", ". . ."};
   private int R;
   private boolean S;
   private final BooleanConsumer T;

   public ews(fhf $$0, evw $$1, String $$2, BooleanConsumer $$3) {
      super(eyy.a);
      this.T = $$3;
      this.y = $$0;
      this.D = $$2;
      this.z = $$1;
      this.E = new ews.a();
      this.A = vu.c("mco.download.title");
      this.B = RateLimiter.create(0.1F);
   }

   @Override
   public void aO_() {
      this.C = this.c(fbg.a(vt.e, $$0 -> {
         this.I = true;
         this.I();
      }).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      this.E();
   }

   private void E() {
      if (!this.K) {
         if (!this.S && this.a(this.z.a) >= 5368709120L) {
            vu $$0 = vu.a("mco.download.confirmation.line1", eul.b(5368709120L));
            vu $$1 = vu.c("mco.download.confirmation.line2");
            this.f.a(new ewv($$0x -> {
               this.S = true;
               this.f.a(this);
               this.J();
            }, ewv.a.a, $$0, $$1, false));
         } else {
            this.J();
         }
      }
   }

   private long a(String $$0) {
      eum $$1 = new eum();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.P++;
      if (this.G != null && this.B.tryAcquire(1)) {
         vu $$0 = this.H();
         this.f.aY().c($$0);
      }
   }

   private vu H() {
      List<vu> $$0 = Lists.newArrayList();
      $$0.add(this.A);
      $$0.add(this.G);
      if (this.H != null) {
         $$0.add(vu.a("mco.download.percent", this.H));
         $$0.add(vu.a("mco.download.speed.narration", eul.b(this.O)));
      }

      if (this.F != null) {
         $$0.add(this.F);
      }

      return vt.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.I = true;
         this.I();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void I() {
      if (this.K && this.T != null && this.F == null) {
         this.T.accept(true);
      }

      this.f.a(this.y);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.A, this.g / 2, 20, -1);
      $$0.a(this.i, this.G, this.g / 2, 50, -1);
      if (this.J) {
         this.c($$0);
      }

      if (this.E.a != 0L && !this.I) {
         this.d($$0);
         this.e($$0);
      }

      if (this.F != null) {
         $$0.a(this.i, this.F, this.g / 2, 110, -65536);
      }
   }

   private void c(fat $$0) {
      int $$1 = this.i.a(this.G);
      if (this.P % 10 == 0) {
         this.R++;
      }

      $$0.a(this.i, Q[this.R % Q.length], this.g / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(fat $$0) {
      double $$1 = Math.min((double)this.E.a / (double)this.E.b, 1.0);
      this.H = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, vu.a("mco.download.percent", this.H), this.g / 2, 84, -1);
   }

   private void e(fat $$0) {
      if (this.P % 20 == 0) {
         if (this.M != null) {
            long $$1 = ac.b() - this.N;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.O = 1000L * (this.E.a - this.M) / $$1;
            this.a($$0, this.O);
         }

         this.M = this.E.a;
         this.N = ac.b();
      } else {
         this.a($$0, this.O);
      }
   }

   private void a(fat $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.i.b(this.H);
         $$0.a(this.i, vu.a("mco.download.speed", eul.b($$1)), this.g / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void J() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.G = vu.c("mco.download.failed");
                  return;
               }

               if (this.I) {
                  this.K();
                  return;
               }

               this.G = vu.a("mco.download.downloading", this.D);
               eum $$0 = new eum();
               $$0.a(this.z.a);
               $$0.a(this.z, this.D, this.E, this.f.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.F = vu.c("mco.download.failed");
                     this.C.b(vt.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.L) {
                        this.G = vu.c("mco.download.extracting");
                     }

                     this.L = true;
                  }

                  if (this.I) {
                     $$0.a();
                     this.K();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.K = true;
               this.G = vu.c("mco.download.done");
               this.C.b(vt.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.F = vu.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.J = false;
               this.K = true;
            }
         }
      }).start();
   }

   private void K() {
      this.G = vu.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
