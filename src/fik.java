import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public class fik extends hfq implements ffv {
   private static final int b = 200;
   private static final int c = 80;
   private static final int B = 95;
   private static final int C = 1;
   private static final String[] D = new String[]{"", ".", ". .", ". . ."};
   private static final xj E = xj.c("mco.upload.verifying");
   private final fid F;
   private final euc G;
   @Nullable
   private final fjf H;
   private final long I;
   private final int J;
   final AtomicReference<ffu> a = new AtomicReference<>();
   private final ffl K;
   private final RateLimiter L;
   @Nullable
   private volatile xj[] M;
   private volatile xj N = xj.c("mco.upload.preparing");
   @Nullable
   private volatile String O;
   private volatile boolean P;
   private volatile boolean Q;
   private volatile boolean R = true;
   private volatile boolean S;
   @Nullable
   private fmd T;
   @Nullable
   private fmd U;
   private int V;
   private final fps W = new fps(this);

   public fik(@Nullable fjf $$0, long $$1, int $$2, fid $$3, euc $$4) {
      super(fjv.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
      this.F = $$3;
      this.G = $$4;
      this.K = new ffl();
      this.L = RateLimiter.create(0.1F);
   }

   @Override
   public void aR_() {
      this.T = this.W.b(fmd.a(xi.k, $$0x -> this.F()).a());
      this.T.k = false;
      this.U = this.W.b(fmd.a(xi.e, $$0x -> this.G()).a());
      if (!this.S) {
         if (this.F.b == -1) {
            this.S = true;
            this.K();
         } else {
            List<fjd> $$0 = new ArrayList<>();
            if (this.H != null) {
               $$0.add(this.H);
            }

            $$0.add(new fjk(this.I, this.F.b, () -> {
               if (!this.S) {
                  this.S = true;
                  this.m.execute(() -> {
                     this.m.a(this);
                     this.K();
                  });
               }
            }));
            this.m.a(new fhw(this.F, $$0.toArray(new fjd[0])));
         }
      }

      this.W.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.W.a();
   }

   private void F() {
      this.m.a(new fhq(new ffc(new fry()), this.I));
   }

   private void G() {
      this.P = true;
      ffu $$0 = this.a.get();
      if ($$0 != null) {
         $$0.b();
      } else {
         this.m.a(this.F);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.R) {
            this.G();
         } else {
            this.F();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.Q && this.K.c() && this.K.d() && this.U != null) {
         this.N = E;
         this.U.j = false;
      }

      $$0.a(this.p, this.N, this.n / 2, 50, -1);
      if (this.R) {
         $$0.a(this.p, D[this.V / 10 % D.length], this.n / 2 + this.p.a(this.N) / 2 + 5, 50, -1, false);
      }

      if (this.K.c() && !this.P) {
         this.c($$0);
         this.d($$0);
      }

      xj[] $$4 = this.M;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.p, $$4[$$5], this.n / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(flq $$0) {
      double $$1 = this.K.e();
      this.O = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, xj.a("mco.upload.percent", this.O), this.n / 2, 84, -1);
   }

   private void d(flq $$0) {
      this.a($$0, this.K.g());
   }

   private void a(flq $$0, long $$1) {
      String $$2 = this.O;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.p.b($$2);
         String $$4 = "(" + ffd.b($$1) + "/s)";
         $$0.a(this.p, $$4, this.n / 2 + $$3 / 2 + 15, 84, -1, false);
      }
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      this.K.f();
      if (this.L.tryAcquire(1)) {
         xj $$0 = this.J();
         this.m.aZ().c($$0);
      }
   }

   private xj J() {
      List<xj> $$0 = Lists.newArrayList();
      $$0.add(this.N);
      if (this.O != null) {
         $$0.add(xj.a("mco.upload.percent", this.O));
      }

      xj[] $$1 = this.M;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return xi.a($$0);
   }

   private void K() {
      Path $$0 = this.m.q.toPath().resolve("saves").resolve(this.G.a());
      fgn $$1 = fgn.a(this.G.g(), this.G.l().c());
      ffu $$2 = new ffu($$0, $$1, this.m.X(), this.I, this.J, this);
      if (!this.a.compareAndSet(null, $$2)) {
         throw new IllegalStateException("Tried to start uploading but was already uploading");
      } else {
         $$2.a().handleAsync(($$0x, $$1x) -> {
            if ($$1x != null) {
               if ($$1x instanceof CompletionException $$2x) {
                  $$1x = $$2x.getCause();
               }

               if ($$1x instanceof ffp $$3) {
                  if ($$3.a() != null) {
                     this.N = $$3.a();
                  }

                  this.a($$3.b());
               } else {
                  this.N = xj.a("mco.upload.failed", $$1x.getMessage());
               }
            } else {
               this.N = xj.c("mco.upload.done");
               if (this.T != null) {
                  this.T.b(xi.d);
               }
            }

            this.Q = true;
            this.R = false;
            if (this.T != null) {
               this.T.k = true;
            }

            if (this.U != null) {
               this.U.k = false;
            }

            this.a.set(null);
            return null;
         }, this.m);
      }
   }

   private void a(@Nullable xj... $$0) {
      this.M = $$0;
   }

   @Override
   public ffl b() {
      return this.K;
   }

   @Override
   public void d() {
      this.N = xj.a("mco.upload.uploading", this.G.b());
   }
}
