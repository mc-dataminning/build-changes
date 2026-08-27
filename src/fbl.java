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

public class fbl extends gty {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int B = 80;
   private static final int C = 95;
   private static final int D = 1;
   private final fly E;
   private final fap F;
   private final wx G;
   private final RateLimiter H;
   private ffz I;
   private final String J;
   private final fbl.a K;
   @Nullable
   private volatile wx L;
   private volatile wx M = wx.c("mco.download.preparing");
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

   public fbl(fly $$0, fap $$1, String $$2, BooleanConsumer $$3) {
      super(fdr.a);
      this.Z = $$3;
      this.E = $$0;
      this.J = $$2;
      this.F = $$1;
      this.K = new fbl.a();
      this.G = wx.c("mco.download.title");
      this.H = RateLimiter.create(0.1F);
   }

   @Override
   public void aM_() {
      this.I = this.c(ffz.a(ww.e, $$0 -> {
         this.O = true;
         this.E();
      }).a((this.n - 200) / 2, this.o - 42, 200, 20).a());
      this.C();
   }

   private void C() {
      if (!this.Q) {
         if (!this.Y && this.a(this.F.a) >= 5368709120L) {
            wx $$0 = wx.a("mco.download.confirmation.line1", eze.b(5368709120L));
            wx $$1 = wx.c("mco.download.confirmation.line2");
            this.m.a(new fbo($$0x -> {
               this.Y = true;
               this.m.a(this);
               this.F();
            }, fbo.a.a, $$0, $$1, false));
         } else {
            this.F();
         }
      }
   }

   private long a(String $$0) {
      ezf $$1 = new ezf();
      return $$1.a($$0);
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      if (this.M != null && this.H.tryAcquire(1)) {
         wx $$0 = this.D();
         this.m.aZ().c($$0);
      }
   }

   private wx D() {
      List<wx> $$0 = Lists.newArrayList();
      $$0.add(this.G);
      $$0.add(this.M);
      if (this.N != null) {
         $$0.add(wx.a("mco.download.percent", this.N));
         $$0.add(wx.a("mco.download.speed.narration", eze.b(this.U)));
      }

      if (this.L != null) {
         $$0.add(this.L);
      }

      return ww.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.O = true;
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.Q && this.Z != null && this.L == null) {
         this.Z.accept(true);
      }

      this.m.a(this.E);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
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

   private void c(ffm $$0) {
      int $$1 = this.p.a(this.M);
      if (this.V % 10 == 0) {
         this.X++;
      }

      $$0.a(this.p, W[this.X % W.length], this.n / 2 + $$1 / 2 + 5, 50, -1, false);
   }

   private void d(ffm $$0) {
      double $$1 = Math.min((double)this.K.a / (double)this.K.b, 1.0);
      this.N = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, wx.a("mco.download.percent", this.N), this.n / 2, 84, -1);
   }

   private void e(ffm $$0) {
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

   private void a(ffm $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.p.b(this.N);
         $$0.a(this.p, wx.a("mco.download.speed", eze.b($$1)), this.n / 2 + $$2 / 2 + 15, 84, -1, false);
      }
   }

   private void F() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.M = wx.c("mco.download.failed");
                  return;
               }

               if (this.O) {
                  this.I();
                  return;
               }

               this.M = wx.a("mco.download.downloading", this.J);
               ezf $$0 = new ezf();
               $$0.a(this.F.a);
               $$0.a(this.F, this.J, this.K, this.m.m());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.L = wx.c("mco.download.failed");
                     this.I.b(ww.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.R) {
                        this.M = wx.c("mco.download.extracting");
                     }

                     this.R = true;
                  }

                  if (this.O) {
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

               this.Q = true;
               this.M = wx.c("mco.download.done");
               this.I.b(ww.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.L = wx.c("mco.download.failed");
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

   private void I() {
      this.M = wx.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
