import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcu extends gvb {
   static final alb a = new alb("pending_invite/accept_highlighted");
   static final alb b = new alb("pending_invite/accept");
   static final alb c = new alb("pending_invite/reject_highlighted");
   static final alb B = new alb("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final xl D = xl.c("mco.invites.nopending");
   static final xl E = xl.c("mco.invites.button.accept");
   static final xl F = xl.c("mco.invites.button.reject");
   private final fmy G;
   private final CompletableFuture<List<fat>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return faj.a().i().a;
      } catch (fbw var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.h());
   @Nullable
   xl I;
   fcu.b J;
   int K = -1;
   private fgz L;
   private fgz M;

   public fcu(fmy $$0, xl $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aN_() {
      fae.f();
      this.J = new fcu.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fcu.a> $$1 = $$0.stream().map($$0x -> new fcu.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aX().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((fgz)fgz.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.C();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((fgz)fgz.a(xk.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((fgz)fgz.a(F, $$0 -> {
         this.a(this.K, false);
         this.K = -1;
         this.C();
      }).a(this.n / 2 + 74, this.o - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.J.l()) {
         String $$2 = this.J.aF_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               faj $$2x = faj.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (fbw var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.h()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fbz $$3 = this.m.ba();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
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

   void C() {
      this.L.k = this.a(this.K);
      this.M.k = this.a(this.K);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends fhv.a<fcu.a> {
      private static final int b = 38;
      final fat c;
      private final List<fcd> d;

      a(final fat $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fcu.a.a(), new fcu.a.b());
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fcd.a(fcu.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fgm $$0, fat $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fcu.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fcu.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fcu.this.p, fdq.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fcd.a($$0, this.d, fcu.this.J, $$2, $$3, $$4, $$5);
         fdq.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public xl a() {
         xl $$0 = xk.b(xl.b(this.c.b), xl.b(this.c.c), fdq.a(this.c.e));
         return xl.a("narrator.select", $$0);
      }

      class a extends fcd {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fgm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fcu.a : fcu.b, $$1, $$2, 18, 18);
            if ($$3) {
               fcu.this.I = fcu.E;
            }
         }

         @Override
         public void a(int $$0) {
            fcu.this.a($$0, true);
         }
      }

      class b extends fcd {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fgm $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fcu.c : fcu.B, $$1, $$2, 18, 18);
            if ($$3) {
               fcu.this.I = fcu.F;
            }
         }

         @Override
         public void a(int $$0) {
            fcu.this.a($$0, false);
         }
      }
   }

   class b extends gva<fcu.a> {
      public b() {
         super(fcu.this.n, fcu.this.o - 72, 32, 36);
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
         fcu.this.K = $$0;
         fcu.this.C();
      }

      public void a(@Nullable fcu.a $$0) {
         super.a($$0);
         fcu.this.K = this.aF_().indexOf($$0);
         fcu.this.C();
      }
   }
}
