import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fnb extends fmx<coy> {
   private static final akn D = new akn("textures/gui/container/beacon.png");
   static final akn E = new akn("container/beacon/button_disabled");
   static final akn F = new akn("container/beacon/button_selected");
   static final akn G = new akn("container/beacon/button_highlighted");
   static final akn H = new akn("container/beacon/button");
   static final akn I = new akn("container/beacon/confirm");
   static final akn J = new akn("container/beacon/cancel");
   private static final wx K = wx.c("block.minecraft.beacon.primary");
   private static final wx L = wx.c("block.minecraft.beacon.secondary");
   private final List<fnb.a> M = Lists.newArrayList();
   @Nullable
   ix<brc> N;
   @Nullable
   ix<brc> O;

   public fnb(final coy $$0, clx $$1, wx $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cph() {
         @Override
         public void a(cov $$0x, int $$1, ctq $$2) {
         }

         @Override
         public void a(cov $$0x, int $$1, int $$2) {
            fnb.this.N = $$0.m();
            fnb.this.O = $$0.n();
         }
      });
   }

   private <T extends ffy & fnb.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.M.clear();
      this.a(new fnb.c(this.z + 164, this.A + 107));
      this.a(new fnb.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dod.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ix<brc> $$4 = dod.a.get($$0).get($$3);
            fnb.d $$5 = new fnb.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dod.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ix<brc> $$10 = dod.a.get(3).get($$9);
         fnb.d $$11 = new fnb.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ix<brc> $$12 = dod.a.get(0).get(0);
      fnb.d $$13 = new fnb.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
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
   protected void b(ffn $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(ffn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new ctq(ctt.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new ctq(ctt.oz), $$4 + 41, $$5 + 109);
      $$0.a(new ctq(ctt.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new ctq(ctt.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new ctq(ctt.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fnb.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fnb.J, ww.e);
      }

      @Override
      public void b() {
         fnb.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fnb.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fnb.I, ww.d);
      }

      @Override
      public void b() {
         fnb.this.m.L().b(new ahq(Optional.ofNullable(fnb.this.N), Optional.ofNullable(fnb.this.O)));
         fnb.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fnb.this.w.o() && fnb.this.N != null;
      }
   }

   class d extends fnb.e {
      private final boolean c;
      protected final int a;
      private ix<brc> d;
      private gnv f;

      public d(int $$0, int $$1, ix<brc> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ix<brc> $$0) {
         this.d = $$0;
         this.f = feb.Q().aF().a($$0);
         this.a(fhl.a(this.b($$0), null));
      }

      protected xl b(ix<brc> $$0) {
         return wx.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fnb.this.N = this.d;
            } else {
               fnb.this.O = this.d;
            }

            fnb.this.E();
         }
      }

      @Override
      protected void a(ffn $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fnb.this.N : fnb.this.O));
      }

      @Override
      protected xl aL_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends ffr implements fnb.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, ww.a);
      }

      protected e(int $$0, int $$1, wx $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ffn $$0, int $$1, int $$2, float $$3) {
         akn $$4;
         if (!this.j) {
            $$4 = fnb.E;
         } else if (this.a) {
            $$4 = fnb.F;
         } else if (this.A()) {
            $$4 = fnb.G;
         } else {
            $$4 = fnb.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ffn var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fjw $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fnb.e {
      private final akn a;

      protected f(int $$0, int $$1, akn $$2, wx $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ffn $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fnb.d {
      public g(int $$0, int $$1, ix<brc> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xl b(ix<brc> $$0) {
         return wx.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fnb.this.N != null) {
            this.k = true;
            this.a(fnb.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
