import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class foa extends fnw<cps> {
   private static final alb D = new alb("textures/gui/container/beacon.png");
   static final alb E = new alb("container/beacon/button_disabled");
   static final alb F = new alb("container/beacon/button_selected");
   static final alb G = new alb("container/beacon/button_highlighted");
   static final alb H = new alb("container/beacon/button");
   static final alb I = new alb("container/beacon/confirm");
   static final alb J = new alb("container/beacon/cancel");
   private static final xl K = xl.c("block.minecraft.beacon.primary");
   private static final xl L = xl.c("block.minecraft.beacon.secondary");
   private final List<foa.a> M = Lists.newArrayList();
   @Nullable
   ji<brv> N;
   @Nullable
   ji<brv> O;

   public foa(final cps $$0, cmr $$1, xl $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cqb() {
         @Override
         public void a(cpp $$0x, int $$1, cuk $$2) {
         }

         @Override
         public void a(cpp $$0x, int $$1, int $$2) {
            foa.this.N = $$0.m();
            foa.this.O = $$0.n();
         }
      });
   }

   private <T extends fgx & foa.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.M.clear();
      this.a(new foa.c(this.z + 164, this.A + 107));
      this.a(new foa.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dox.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ji<brv> $$4 = dox.a.get($$0).get($$3);
            foa.d $$5 = new foa.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dox.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ji<brv> $$10 = dox.a.get(3).get($$9);
         foa.d $$11 = new foa.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ji<brv> $$12 = dox.a.get(0).get(0);
      foa.d $$13 = new foa.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
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
   protected void b(fgm $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fgm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cuk(cun.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new cuk(cun.oz), $$4 + 41, $$5 + 109);
      $$0.a(new cuk(cun.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cuk(cun.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cuk(cun.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends foa.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, foa.J, xk.e);
      }

      @Override
      public void b() {
         foa.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends foa.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, foa.I, xk.d);
      }

      @Override
      public void b() {
         foa.this.m.L().b(new aie(Optional.ofNullable(foa.this.N), Optional.ofNullable(foa.this.O)));
         foa.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = foa.this.w.o() && foa.this.N != null;
      }
   }

   class d extends foa.e {
      private final boolean c;
      protected final int a;
      private ji<brv> d;
      private gou f;

      public d(final int $$0, final int $$1, final ji<brv> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ji<brv> $$0) {
         this.d = $$0;
         this.f = ffa.Q().aF().a($$0);
         this.a(fik.a(this.b($$0), null));
      }

      protected xz b(ji<brv> $$0) {
         return xl.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               foa.this.N = this.d;
            } else {
               foa.this.O = this.d;
            }

            foa.this.E();
         }
      }

      @Override
      protected void a(fgm $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? foa.this.N : foa.this.O));
      }

      @Override
      protected xz aL_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fgq implements foa.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xk.a);
      }

      protected e(int $$0, int $$1, xl $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         alb $$4;
         if (!this.j) {
            $$4 = foa.E;
         } else if (this.a) {
            $$4 = foa.F;
         } else if (this.A()) {
            $$4 = foa.G;
         } else {
            $$4 = foa.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fgm var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fkv $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends foa.e {
      private final alb a;

      protected f(int $$0, int $$1, alb $$2, xl $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fgm $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends foa.d {
      public g(final int $$0, final int $$1, final ji<brv> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xz b(ji<brv> $$0) {
         return xl.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (foa.this.N != null) {
            this.k = true;
            this.a(foa.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
