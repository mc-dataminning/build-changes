import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fna extends fmw<cow> {
   private static final akm D = new akm("textures/gui/container/beacon.png");
   static final akm E = new akm("container/beacon/button_disabled");
   static final akm F = new akm("container/beacon/button_selected");
   static final akm G = new akm("container/beacon/button_highlighted");
   static final akm H = new akm("container/beacon/button");
   static final akm I = new akm("container/beacon/confirm");
   static final akm J = new akm("container/beacon/cancel");
   private static final wx K = wx.c("block.minecraft.beacon.primary");
   private static final wx L = wx.c("block.minecraft.beacon.secondary");
   private final List<fna.a> M = Lists.newArrayList();
   @Nullable
   ix<bra> N;
   @Nullable
   ix<bra> O;

   public fna(final cow $$0, clv $$1, wx $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cpf() {
         @Override
         public void a(cot $$0x, int $$1, cto $$2) {
         }

         @Override
         public void a(cot $$0x, int $$1, int $$2) {
            fna.this.N = $$0.m();
            fna.this.O = $$0.n();
         }
      });
   }

   private <T extends ffx & fna.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.M.clear();
      this.a(new fna.c(this.z + 164, this.A + 107));
      this.a(new fna.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dob.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ix<bra> $$4 = dob.a.get($$0).get($$3);
            fna.d $$5 = new fna.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dob.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ix<bra> $$10 = dob.a.get(3).get($$9);
         fna.d $$11 = new fna.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ix<bra> $$12 = dob.a.get(0).get(0);
      fna.d $$13 = new fna.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.w.l();
      this.M.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(ffm $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(ffm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cto(ctr.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new cto(ctr.oz), $$4 + 41, $$5 + 109);
      $$0.a(new cto(ctr.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cto(ctr.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cto(ctr.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fna.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fna.J, ww.e);
      }

      @Override
      public void b() {
         fna.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fna.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fna.I, ww.d);
      }

      @Override
      public void b() {
         fna.this.m.L().b(new ahp(Optional.ofNullable(fna.this.N), Optional.ofNullable(fna.this.O)));
         fna.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fna.this.w.o() && fna.this.N != null;
      }
   }

   class d extends fna.e {
      private final boolean c;
      protected final int a;
      private ix<bra> d;
      private gnv f;

      public d(int $$0, int $$1, ix<bra> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ix<bra> $$0) {
         this.d = $$0;
         this.f = fdz.Q().aG().a($$0);
         this.a(fhk.a(this.b($$0), null));
      }

      protected xl b(ix<bra> $$0) {
         return wx.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fna.this.N = this.d;
            } else {
               fna.this.O = this.d;
            }

            fna.this.E();
         }
      }

      @Override
      protected void a(ffm $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fna.this.N : fna.this.O));
      }

      @Override
      protected xl aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends ffq implements fna.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, ww.a);
      }

      protected e(int $$0, int $$1, wx $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ffm $$0, int $$1, int $$2, float $$3) {
         akm $$4;
         if (!this.j) {
            $$4 = fna.E;
         } else if (this.a) {
            $$4 = fna.F;
         } else if (this.A()) {
            $$4 = fna.G;
         } else {
            $$4 = fna.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ffm var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fjv $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fna.e {
      private final akm a;

      protected f(int $$0, int $$1, akm $$2, wx $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ffm $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fna.d {
      public g(int $$0, int $$1, ix<bra> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xl b(ix<bra> $$0) {
         return wx.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fna.this.N != null) {
            this.k = true;
            this.a(fna.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
