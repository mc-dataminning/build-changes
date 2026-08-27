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

public class eqd extends ghe {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int v = 80;
   private static final int w = 95;
   private static final int x = 1;
   private final fah y;
   private final eph z;
   private final ur A;
   private final RateLimiter B;
   private eum C;
   private final String D;
   private final eqd.a E;
   @Nullable
   private volatile ur F;
   private volatile ur G = ur.c("mco.download.preparing");
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

   public eqd(fah $$0, eph $$1, String $$2, BooleanConsumer $$3) {
      super(esj.a);
      this.T = $$3;
      this.y = $$0;
      this.D = $$2;
      this.z = $$1;
      this.E = new eqd.a();
      this.A = ur.c("mco.download.title");
      this.B = RateLimiter.create(0.1F);
   }

   @Override
   public void aO_() {
      this.C = this.d(eum.a(uq.e, $$0 -> {
         this.I = true;
         this.E();
      }).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      this.C();
   }

   private void C() {
      if (!this.K) {
         if (!this.S && this.a(this.z.a) >= 5368709120L) {
            ur $$0 = ur.a("mco.download.confirmation.line1", enw.b(5368709120L));
            ur $$1 = ur.c("mco.download.confirmation.line2");
            this.f.a(new eqg($$0x -> {
               this.S = true;
               this.f.a(this);
               this.F();
            }, eqg.a.a, $$0, $$1, false));
         } else {
            this.F();
         }
      }
   }

   private long a(String $$0) {
      enx $$1 = new enx();
      return $$1.a($$0);
   }

   @Override
   public void d() {
      super.d();
      this.P++;
      if (this.G != null && this.B.tryAcquire(1)) {
         ur $$0 = this.D();
         this.f.aU().c($$0);
      }
   }

   private ur D() {
      List<ur> $$0 = Lists.newArrayList();
      $$0.add(this.A);
      $$0.add(this.G);
      if (this.H != null) {
         $$0.add(ur.a("mco.download.percent", this.H));
         $$0.add(ur.a("mco.download.speed.narration", enw.b(this.O)));
      }

      if (this.F != null) {
         $$0.add(this.F);
      }

      return uq.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.I = true;
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.K && this.T != null && this.F == null) {
         this.T.accept(true);
      }

      this.f.a(this.y);
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.A, this.g / 2, 20, 16777215);
      $$0.a(this.i, this.G, this.g / 2, 50, 16777215);
      if (this.J) {
         this.c($$0);
      }

      if (this.E.a != 0L && !this.I) {
         this.d($$0);
         this.e($$0);
      }

      if (this.F != null) {
         $$0.a(this.i, this.F, this.g / 2, 110, 16711680);
      }
   }

   private void c(eub $$0) {
      int $$1 = this.i.a(this.G);
      if (this.P % 10 == 0) {
         this.R++;
      }

      $$0.a(this.i, Q[this.R % Q.length], this.g / 2 + $$1 / 2 + 5, 50, 16777215, false);
   }

   private void d(eub $$0) {
      double $$1 = Math.min((double)this.E.a / (double)this.E.b, 1.0);
      this.H = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -2501934);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, ur.a("mco.download.percent", this.H), this.g / 2, 84, 16777215);
   }

   private void e(eub $$0) {
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

   private void a(eub $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.i.b(this.H);
         $$0.a(this.i, ur.a("mco.download.speed", enw.b($$1)), this.g / 2 + $$2 / 2 + 15, 84, 16777215, false);
      }
   }

   private void F() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.G = ur.c("mco.download.failed");
                  return;
               }

               if (this.I) {
                  this.G();
                  return;
               }

               this.G = ur.a("mco.download.downloading", this.D);
               enx $$0 = new enx();
               $$0.a(this.z.a);
               $$0.a(this.z, this.D, this.E, this.f.l());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.F = ur.c("mco.download.failed");
                     this.C.b(uq.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.L) {
                        this.G = ur.c("mco.download.extracting");
                     }

                     this.L = true;
                  }

                  if (this.I) {
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

               this.K = true;
               this.G = ur.c("mco.download.done");
               this.C.b(uq.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.F = ur.c("mco.download.failed");
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

   private void G() {
      this.G = ur.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
