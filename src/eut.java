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

public class eut extends gmv {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int v = 80;
   private static final int w = 95;
   private static final int x = 1;
   private final ffe y;
   private final etx z;
   private final vq A;
   private final RateLimiter B;
   private ezh C;
   private final String D;
   private final eut.a E;
   @Nullable
   private volatile vq F;
   private volatile vq G = vq.c("mco.download.preparing");
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

   public eut(ffe $$0, etx $$1, String $$2, BooleanConsumer $$3) {
      super(ewz.a);
      this.T = $$3;
      this.y = $$0;
      this.D = $$2;
      this.z = $$1;
      this.E = new eut.a();
      this.A = vq.c("mco.download.title");
      this.B = RateLimiter.create(0.1F);
   }

   @Override
   public void aQ_() {
      this.C = this.d(ezh.a(vp.e, $$0 -> {
         this.I = true;
         this.I();
      }).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      this.E();
   }

   private void E() {
      if (!this.K) {
         if (!this.S && this.a(this.z.a) >= 5368709120L) {
            vq $$0 = vq.a("mco.download.confirmation.line1", esm.b(5368709120L));
            vq $$1 = vq.c("mco.download.confirmation.line2");
            this.f.a(new euw($$0x -> {
               this.S = true;
               this.f.a(this);
               this.J();
            }, euw.a.a, $$0, $$1, false));
         } else {
            this.J();
         }
      }
   }

   private long a(String $$0) {
      esn $$1 = new esn();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.P++;
      if (this.G != null && this.B.tryAcquire(1)) {
         vq $$0 = this.H();
         this.f.aW().c($$0);
      }
   }

   private vq H() {
      List<vq> $$0 = Lists.newArrayList();
      $$0.add(this.A);
      $$0.add(this.G);
      if (this.H != null) {
         $$0.add(vq.a("mco.download.percent", this.H));
         $$0.add(vq.a("mco.download.speed.narration", esm.b(this.O)));
      }

      if (this.F != null) {
         $$0.add(this.F);
      }

      return vp.a($$0);
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
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
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

   private void c(eyu $$0) {
      int $$1 = this.i.a(this.G);
      if (this.P % 10 == 0) {
         this.R++;
      }

      $$0.a(this.i, Q[this.R % Q.length], this.g / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(eyu $$0) {
      double $$1 = Math.min((double)this.E.a / (double)this.E.b, 1.0);
      this.H = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, vq.a("mco.download.percent", this.H), this.g / 2, 84, -1);
   }

   private void e(eyu $$0) {
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

   private void a(eyu $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.i.b(this.H);
         $$0.a(this.i, vq.a("mco.download.speed", esm.b($$1)), this.g / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void J() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.G = vq.c("mco.download.failed");
                  return;
               }

               if (this.I) {
                  this.K();
                  return;
               }

               this.G = vq.a("mco.download.downloading", this.D);
               esn $$0 = new esn();
               $$0.a(this.z.a);
               $$0.a(this.z, this.D, this.E, this.f.l());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.F = vq.c("mco.download.failed");
                     this.C.b(vp.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.L) {
                        this.G = vq.c("mco.download.extracting");
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
               this.G = vq.c("mco.download.done");
               this.C.b(vp.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.F = vq.c("mco.download.failed");
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
      this.G = vq.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
