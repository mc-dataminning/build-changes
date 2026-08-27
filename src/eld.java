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

public class eld extends gan {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int G = 80;
   private static final int H = 95;
   private static final int I = 1;
   private final euq J;
   private final ekg K;
   private final sw L;
   private final RateLimiter M;
   private epi N;
   private final String O;
   private final eld.a P;
   @Nullable
   private volatile sw Q;
   private volatile sw R = sw.c("mco.download.preparing");
   @Nullable
   private volatile String S;
   private volatile boolean T;
   private volatile boolean U = true;
   private volatile boolean V;
   private volatile boolean W;
   @Nullable
   private Long X;
   @Nullable
   private Long Y;
   private long Z;
   private int aa;
   private static final String[] ab = new String[]{"", ".", ". .", ". . ."};
   private int ac;
   private boolean ad;
   private final BooleanConsumer ae;

   public eld(euq $$0, ekg $$1, String $$2, BooleanConsumer $$3) {
      super(enf.a);
      this.ae = $$3;
      this.J = $$0;
      this.O = $$2;
      this.K = $$1;
      this.P = new eld.a();
      this.L = sw.c("mco.download.title");
      this.M = RateLimiter.create(0.1F);
   }

   @Override
   public void b() {
      this.N = this.d(epi.a(sv.e, $$0 -> {
         this.T = true;
         this.D();
      }).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      this.B();
   }

   private void B() {
      if (!this.V) {
         if (!this.ad && this.a(this.K.a) >= 5368709120L) {
            sw $$0 = sw.a("mco.download.confirmation.line1", eiv.b(5368709120L));
            sw $$1 = sw.c("mco.download.confirmation.line2");
            this.f.a(new elg($$0x -> {
               this.ad = true;
               this.f.a(this);
               this.E();
            }, elg.a.a, $$0, $$1, false));
         } else {
            this.E();
         }
      }
   }

   private long a(String $$0) {
      eiw $$1 = new eiw();
      return $$1.a($$0);
   }

   @Override
   public void f() {
      super.f();
      this.aa++;
      if (this.R != null && this.M.tryAcquire(1)) {
         sw $$0 = this.C();
         this.f.aU().c($$0);
      }
   }

   private sw C() {
      List<sw> $$0 = Lists.newArrayList();
      $$0.add(this.L);
      $$0.add(this.R);
      if (this.S != null) {
         $$0.add(sw.b(this.S + "%"));
         $$0.add(sw.b(eiv.b(this.Z) + "/s"));
      }

      if (this.Q != null) {
         $$0.add(this.Q);
      }

      return sv.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.T = true;
         this.D();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void D() {
      if (this.V && this.ae != null && this.Q == null) {
         this.ae.accept(true);
      }

      this.f.a(this.J);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.L, this.g / 2, 20, 16777215);
      $$0.a(this.i, this.R, this.g / 2, 50, 16777215);
      if (this.U) {
         this.c($$0);
      }

      if (this.P.a != 0L && !this.T) {
         this.d($$0);
         this.e($$0);
      }

      if (this.Q != null) {
         $$0.a(this.i, this.Q, this.g / 2, 110, 16711680);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void c(eox $$0) {
      int $$1 = this.i.a(this.R);
      if (this.aa % 10 == 0) {
         this.ac++;
      }

      $$0.a(this.i, ab[this.ac % ab.length], this.g / 2 + $$1 / 2 + 5, 50, 16777215, false);
   }

   private void d(eox $$0) {
      double $$1 = Math.min((double)this.P.a / (double)this.P.b, 1.0);
      this.S = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -2501934);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, sw.a("mco.download.percent", this.S), this.g / 2, 84, 16777215);
   }

   private void e(eox $$0) {
      if (this.aa % 20 == 0) {
         if (this.X != null) {
            long $$1 = ac.b() - this.Y;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.Z = 1000L * (this.P.a - this.X) / $$1;
            this.a($$0, this.Z);
         }

         this.X = this.P.a;
         this.Y = ac.b();
      } else {
         this.a($$0, this.Z);
      }
   }

   private void a(eox $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.i.b(this.S);
         $$0.a(this.i, sw.a("mco.download.speed", eiv.b($$1)), this.g / 2 + $$2 / 2 + 15, 84, 16777215, false);
      }
   }

   private void E() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.R = sw.c("mco.download.failed");
                  return;
               }

               if (this.T) {
                  this.F();
                  return;
               }

               this.R = sw.a("mco.download.downloading", this.O);
               eiw $$0 = new eiw();
               $$0.a(this.K.a);
               $$0.a(this.K, this.O, this.P, this.f.k());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.Q = sw.c("mco.download.failed");
                     this.N.b(sv.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.W) {
                        this.R = sw.c("mco.download.extracting");
                     }

                     this.W = true;
                  }

                  if (this.T) {
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

               this.V = true;
               this.R = sw.c("mco.download.done");
               this.N.b(sv.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.Q = sw.c("mco.download.failed");
               var10.printStackTrace();
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.U = false;
               this.V = true;
            }
         }
      }).start();
   }

   private void F() {
      this.R = sw.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
