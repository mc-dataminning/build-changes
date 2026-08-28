import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class foh extends fod<cpz> {
   private static final alf D = new alf("textures/gui/container/beacon.png");
   static final alf E = new alf("container/beacon/button_disabled");
   static final alf F = new alf("container/beacon/button_selected");
   static final alf G = new alf("container/beacon/button_highlighted");
   static final alf H = new alf("container/beacon/button");
   static final alf I = new alf("container/beacon/confirm");
   static final alf J = new alf("container/beacon/cancel");
   private static final xp K = xp.c("block.minecraft.beacon.primary");
   private static final xp L = xp.c("block.minecraft.beacon.secondary");
   private final List<foh.a> M = Lists.newArrayList();
   @Nullable
   ji<bsc> N;
   @Nullable
   ji<bsc> O;

   public foh(final cpz $$0, cmy $$1, xp $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cqi() {
         @Override
         public void a(cpw $$0x, int $$1, cur $$2) {
         }

         @Override
         public void a(cpw $$0x, int $$1, int $$2) {
            foh.this.N = $$0.m();
            foh.this.O = $$0.n();
         }
      });
   }

   private <T extends fhe & foh.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.M.clear();
      this.a(new foh.c(this.z + 164, this.A + 107));
      this.a(new foh.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dpe.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ji<bsc> $$4 = dpe.a.get($$0).get($$3);
            foh.d $$5 = new foh.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dpe.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ji<bsc> $$10 = dpe.a.get(3).get($$9);
         foh.d $$11 = new foh.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ji<bsc> $$12 = dpe.a.get(0).get(0);
      foh.d $$13 = new foh.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void E() {
      super.E();
      this.I();
   }

   void I() {
      int $$0 = this.w.l();
      this.M.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fgt $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fgt $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cur(cuu.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new cur(cuu.oz), $$4 + 41, $$5 + 109);
      $$0.a(new cur(cuu.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cur(cuu.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cur(cuu.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends foh.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, foh.J, xo.e);
      }

      @Override
      public void b() {
         foh.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends foh.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, foh.I, xo.d);
      }

      @Override
      public void b() {
         foh.this.m.L().b(new aii(Optional.ofNullable(foh.this.N), Optional.ofNullable(foh.this.O)));
         foh.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = foh.this.w.o() && foh.this.N != null;
      }
   }

   class d extends foh.e {
      private final boolean c;
      protected final int a;
      private ji<bsc> d;
      private gpb f;

      public d(final int $$0, final int $$1, final ji<bsc> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ji<bsc> $$0) {
         this.d = $$0;
         this.f = ffh.Q().aF().a($$0);
         this.a(fir.a(this.b($$0), null));
      }

      protected yd b(ji<bsc> $$0) {
         return xp.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               foh.this.N = this.d;
            } else {
               foh.this.O = this.d;
            }

            foh.this.I();
         }
      }

      @Override
      protected void a(fgt $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? foh.this.N : foh.this.O));
      }

      @Override
      protected yd aJ_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fgx implements foh.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xo.a);
      }

      protected e(int $$0, int $$1, xp $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fgt $$0, int $$1, int $$2, float $$3) {
         alf $$4;
         if (!this.j) {
            $$4 = foh.E;
         } else if (this.a) {
            $$4 = foh.F;
         } else if (this.A()) {
            $$4 = foh.G;
         } else {
            $$4 = foh.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fgt var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(flc $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends foh.e {
      private final alf a;

      protected f(int $$0, int $$1, alf $$2, xp $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fgt $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends foh.d {
      public g(final int $$0, final int $$1, final ji<bsc> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected yd b(ji<bsc> $$0) {
         return xp.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (foh.this.N != null) {
            this.k = true;
            this.a(foh.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
