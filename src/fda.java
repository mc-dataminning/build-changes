import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fda extends gvh {
   static final alf a = new alf("pending_invite/accept_highlighted");
   static final alf b = new alf("pending_invite/accept");
   static final alf c = new alf("pending_invite/reject_highlighted");
   static final alf B = new alf("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xp D = xp.c("mco.invites.nopending");
   static final xp E = xp.c("mco.invites.button.accept");
   static final xp F = xp.c("mco.invites.button.reject");
   private final fne G;
   private final CompletableFuture<List<faz>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return fap.a().i().a;
      } catch (fcc var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   xp I;
   fda.b J;
   int K = -1;
   private fhf L;
   private fhf M;

   public fda(fne $$0, xp $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aM_() {
      fak.f();
      this.J = new fda.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fda.a> $$1 = $$0.stream().map($$0x -> new fda.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aX().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fhf)fhf.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.E();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fhf)fhf.a(xo.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fhf)fhf.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.E();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.E();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aD_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               fap $$2x = fap.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fcc var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fcf $$3 = this.m.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.I = null;
      $$0.a(this.p, this.l, this.n / 2, 12, -1);
      if (this.I != null) {
         $$0.a(this.p, this.I, $$1, $$2);
      }

      if (this.H.isDone() && this.J.l() == 0) {
         $$0.a(this.p, D, this.n / 2, this.o / 2 - 20, -1);
      }
   }

   void E() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fib.a<fda.a> {
      private static final int b = 38;
      final faz c;
      private final List<fcj> d;

      a(final faz $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fda.a.a(), new fda.a.b());
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fcj.a(fda.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fgs $$0, faz $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fda.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fda.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fda.this.p, fdw.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fcj.a($$0, this.d, fda.this.J, $$2, $$3, $$4, $$5);
         fdw.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xp a() {
         xp $$0 = xo.b(xp.b(this.c.b), xp.b(this.c.c), fdw.a(this.c.e));
         return xp.a("narrator.select", $$0);
      }

      class a extends fcj {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fgs $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fda.a : fda.b, $$1, $$2, 18, 18);
            if ($$3) {
               fda.this.I = fda.E;
            }
         }

         @Override
         public void a(int $$0) {
            fda.this.a($$0, true);
         }
      }

      class b extends fcj {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fgs $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fda.c : fda.B, $$1, $$2, 18, 18);
            if ($$3) {
               fda.this.I = fda.F;
            }
         }

         @Override
         public void a(int $$0) {
            fda.this.a($$0, false);
         }
      }
   }

   class b extends gvg<fda.a> {
      public b() {
         super(fda.this.n, fda.this.o - 72, 32, 36);
      }

      @Override
      public void a(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.l() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void b(int $$0) {
         super.b($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         fda.this.K = $$0;
         fda.this.E();
      }

      public void a(@Nullable fda.a $$0) {
         super.a($$0);
         fda.this.K = this.aD_().indexOf($$0);
         fda.this.E();
      }
   }
}
