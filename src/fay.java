import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fay extends gtb {
   static final akh a = new akh("pending_invite/accept_highlighted");
   static final akh b = new akh("pending_invite/accept");
   static final akh c = new akh("pending_invite/reject_highlighted");
   static final akh B = new akh("pending_invite/reject");
   private static final Logger C = LogUtils.getLogger();
   private static final wu D = wu.c("mco.invites.nopending");
   static final wu E = wu.c("mco.invites.button.accept");
   static final wu F = wu.c("mco.invites.button.reject");
   private final fld G;
   private final CompletableFuture<List<eyx>> H = CompletableFuture.supplyAsync(() -> {
      try {
         return eyn.a().i().a;
      } catch (faa var1x) {
         C.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   wu I;
   fay.b J;
   int K = -1;
   private ffe L;
   private ffe M;

   public fay(fld $$0, wu $$1) {
      super($$1);
      this.G = $$0;
   }

   @Override
   public void aM_() {
      eyi.f();
      this.J = new fay.b();
      this.H.thenAcceptAsync($$0 -> {
         List<fay.a> $$1 = $$0.stream().map($$0x -> new fay.a($$0x)).toList();
         this.J.a($$1);
         if ($$1.isEmpty()) {
            this.m.aZ().b(D);
         }
      }, this.q);
      this.c(this.J);
      this.L = this.c((ffe)ffe.a(E, $$0 -> {
         this.a(this.K, true);
         this.K = -1;
         this.C();
      }).a(this.n / 2 - 174, this.o - 32, 100, 20).a());
      this.c((ffe)ffe.a(wt.d, $$0 -> this.d()).a(this.n / 2 - 50, this.o - 32, 100, 20).a());
      this.M = this.c((ffe)ffe.a(F, $$0 -> {
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
         String $$2 = this.J.aE_().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               eyn $$2x = eyn.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (faa var3x) {
               C.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.J.a($$0);
               fad $$3 = this.m.bc();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.d.a();
            }
         }, this.q);
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
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

   class a extends fga.a<fay.a> {
      private static final int b = 38;
      final eyx c;
      private final List<fah> d;

      a(eyx $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new fay.a.a(), new fay.a.b());
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fah.a(fay.this.J, this, this.d, $$2, $$0, $$1);
         return super.a($$0, $$1, $$2);
      }

      private void a(fer $$0, eyx $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(fay.this.p, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(fay.this.p, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(fay.this.p, fbu.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         fah.a($$0, this.d, fay.this.J, $$2, $$3, $$4, $$5);
         fbu.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public wu a() {
         wu $$0 = wt.b(wu.b(this.c.b), wu.b(this.c.c), fbu.a(this.c.e));
         return wu.a("narrator.select", $$0);
      }

      class a extends fah {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(fer $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fay.a : fay.b, $$1, $$2, 18, 18);
            if ($$3) {
               fay.this.I = fay.E;
            }
         }

         @Override
         public void a(int $$0) {
            fay.this.a($$0, true);
         }
      }

      class b extends fah {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(fer $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? fay.c : fay.B, $$1, $$2, 18, 18);
            if ($$3) {
               fay.this.I = fay.F;
            }
         }

         @Override
         public void a(int $$0) {
            fay.this.a($$0, false);
         }
      }
   }

   class b extends gta<fay.a> {
      public b() {
         super(fay.this.n, fay.this.o - 72, 32, 36);
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
         fay.this.K = $$0;
         fay.this.C();
      }

      public void a(@Nullable fay.a $$0) {
         super.a($$0);
         fay.this.K = this.aE_().indexOf($$0);
         fay.this.C();
      }
   }
}
