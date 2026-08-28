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

public class fmw extends hpb implements fkg {
   private static final int b = 200;
   private static final int c = 80;
   private static final int C = 95;
   private static final int D = 1;
   private static final String[] E = new String[]{"", ".", ". .", ". . ."};
   private static final wy F = wy.c("mco.upload.verifying");
   private final fmp G;
   private final eyo H;
   @Nullable
   private final fnr I;
   private final long J;
   private final int K;
   final AtomicReference<fkf> a = new AtomicReference<>();
   private final fjw L;
   private final RateLimiter M;
   @Nullable
   private volatile wy[] N;
   private volatile wy O = wy.c("mco.upload.preparing");
   @Nullable
   private volatile String P;
   private volatile boolean Q;
   private volatile boolean R;
   private volatile boolean S = true;
   private volatile boolean T;
   @Nullable
   private fsc U;
   @Nullable
   private fsc V;
   private int W;
   private final fvq X = new fvq(this);

   public fmw(@Nullable fnr $$0, long $$1, int $$2, fmp $$3, eyo $$4) {
      super(foi.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
      this.G = $$3;
      this.H = $$4;
      this.L = new fjw();
      this.M = RateLimiter.create(0.1F);
   }

   @Override
   public void aN_() {
      this.U = this.X.b(fsc.a(wx.k, $$0x -> this.E()).a());
      this.U.k = false;
      this.V = this.X.b(fsc.a(wx.e, $$0x -> this.F()).a());
      if (!this.T) {
         if (this.G.b == -1) {
            this.T = true;
            this.H();
         } else {
            List<fnp> $$0 = new ArrayList<>();
            if (this.I != null) {
               $$0.add(this.I);
            }

            $$0.add(new fnw(this.J, this.G.b, () -> {
               if (!this.T) {
                  this.T = true;
                  this.m.execute(() -> {
                     this.m.a(this);
                     this.H();
                  });
               }
            }));
            this.m.a(new fmi(this.G, $$0.toArray(new fnp[0])));
         }
      }

      this.X.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.X.a();
   }

   private void E() {
      this.m.a(new fmc(new fjn(new fxw()), this.J));
   }

   private void F() {
      this.Q = true;
      fkf $$0 = this.a.get();
      if ($$0 != null) {
         $$0.b();
      } else {
         this.m.a(this.G);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.S) {
            this.F();
         } else {
            this.E();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.R && this.L.c() && this.L.d() && this.V != null) {
         this.O = F;
         this.V.j = false;
      }

      $$0.a(this.p, this.O, this.n / 2, 50, -1);
      if (this.S) {
         $$0.b(this.p, E[this.W / 10 % E.length], this.n / 2 + this.p.a(this.O) / 2 + 5, 50, -1);
      }

      if (this.L.c() && !this.Q) {
         this.c($$0);
         this.d($$0);
      }

      wy[] $$4 = this.N;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.p, $$4[$$5], this.n / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(fro $$0) {
      double $$1 = this.L.e();
      this.P = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, wy.a("mco.upload.percent", this.P), this.n / 2, 84, -1);
   }

   private void d(fro $$0) {
      this.a($$0, this.L.g());
   }

   private void a(fro $$0, long $$1) {
      String $$2 = this.P;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.p.b($$2);
         String $$4 = "(" + fjo.b($$1) + "/s)";
         $$0.b(this.p, $$4, this.n / 2 + $$3 / 2 + 15, 84, -1);
      }
   }

   @Override
   public void e() {
      super.e();
      this.W++;
      this.L.f();
      if (this.M.tryAcquire(1)) {
         wy $$0 = this.G();
         this.m.aY().c($$0);
      }
   }

   private wy G() {
      List<wy> $$0 = Lists.newArrayList();
      $$0.add(this.O);
      if (this.P != null) {
         $$0.add(wy.a("mco.upload.percent", this.P));
      }

      wy[] $$1 = this.N;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return wx.a($$0);
   }

   private void H() {
      Path $$0 = this.m.q.toPath().resolve("saves").resolve(this.H.a());
      fkz $$1 = fkz.a(this.H.g(), true, this.H.l().c());
      fkf $$2 = new fkf($$0, $$1, this.m.X(), this.J, this.K, this);
      if (!this.a.compareAndSet(null, $$2)) {
         throw new IllegalStateException("Tried to start uploading but was already uploading");
      } else {
         $$2.a().handleAsync(($$0x, $$1x) -> {
            if ($$1x != null) {
               if ($$1x instanceof CompletionException $$2x) {
                  $$1x = $$2x.getCause();
               }

               if ($$1x instanceof fka $$3) {
                  if ($$3.a() != null) {
                     this.O = $$3.a();
                  }

                  this.a($$3.b());
               } else {
                  this.O = wy.a("mco.upload.failed", $$1x.getMessage());
               }
            } else {
               this.O = wy.c("mco.upload.done");
               if (this.U != null) {
                  this.U.b(wx.d);
               }
            }

            this.R = true;
            this.S = false;
            if (this.U != null) {
               this.U.k = true;
            }

            if (this.V != null) {
               this.V.k = false;
            }

            this.a.set(null);
            return null;
         }, this.m);
      }
   }

   private void a(@Nullable wy... $$0) {
      this.N = $$0;
   }

   @Override
   public fjw b() {
      return this.L;
   }

   @Override
   public void d() {
      this.O = wy.a("mco.upload.uploading", this.H.b());
   }
}
