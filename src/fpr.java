import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fpr extends fpn<cpj> {
   private static final akt D = new akt("textures/gui/container/beacon.png");
   static final akt E = new akt("container/beacon/button_disabled");
   static final akt F = new akt("container/beacon/button_selected");
   static final akt G = new akt("container/beacon/button_highlighted");
   static final akt H = new akt("container/beacon/button");
   static final akt I = new akt("container/beacon/confirm");
   static final akt J = new akt("container/beacon/cancel");
   private static final xe K = xe.c("block.minecraft.beacon.primary");
   private static final xe L = xe.c("block.minecraft.beacon.secondary");
   private final List<fpr.a> M = Lists.newArrayList();
   @Nullable
   ja<brf> N;
   @Nullable
   ja<brf> O;

   public fpr(final cpj $$0, clx $$1, xe $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cps() {
         @Override
         public void a(cpg $$0x, int $$1, cuh $$2) {
         }

         @Override
         public void a(cpg $$0x, int $$1, int $$2) {
            fpr.this.N = $$0.m();
            fpr.this.O = $$0.n();
         }
      });
   }

   private <T extends fil & fpr.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.M.clear();
      this.a(new fpr.c(this.z + 164, this.A + 107));
      this.a(new fpr.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dpw.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ja<brf> $$4 = dpw.a.get($$0).get($$3);
            fpr.d $$5 = new fpr.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dpw.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ja<brf> $$10 = dpw.a.get(3).get($$9);
         fpr.d $$11 = new fpr.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ja<brf> $$12 = dpw.a.get(0).get(0);
      fpr.d $$13 = new fpr.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
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
   protected void b(fia $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cuh(cuk.qc), $$4 + 20, $$5 + 109);
      $$0.a(new cuh(cuk.pR), $$4 + 41, $$5 + 109);
      $$0.a(new cuh(cuk.pO), $$4 + 41 + 18, $$5 + 109);
      $$0.a(new cuh(cuk.pP), $$4 + 41 + 37, $$5 + 109);
      $$0.a(new cuh(cuk.qb), $$4 + 42 + 55, $$5 + 109);
      $$0.a(new cuh(cuk.pX), $$4 + 42 + 74, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fpr.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fpr.J, xd.e);
      }

      @Override
      public void b() {
         fpr.this.m.s.t();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fpr.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fpr.I, xd.d);
      }

      @Override
      public void b() {
         fpr.this.m.L().b(new ahw(Optional.ofNullable(fpr.this.N), Optional.ofNullable(fpr.this.O)));
         fpr.this.m.s.t();
      }

      @Override
      public void a(int $$0) {
         this.j = fpr.this.w.o() && fpr.this.N != null;
      }
   }

   class d extends fpr.e {
      private final boolean c;
      protected final int a;
      private ja<brf> d;
      private gqy f;

      public d(int $$0, int $$1, ja<brf> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ja<brf> $$0) {
         this.d = $$0;
         this.f = fgj.Q().aG().a($$0);
         this.a(fjy.a(this.b($$0), null));
      }

      protected xs b(ja<brf> $$0) {
         return xe.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fpr.this.N = this.d;
            } else {
               fpr.this.O = this.d;
            }

            fpr.this.E();
         }
      }

      @Override
      protected void a(fia $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fpr.this.N : fpr.this.O));
      }

      @Override
      protected xs aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fie implements fpr.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xd.a);
      }

      protected e(int $$0, int $$1, xe $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fia $$0, int $$1, int $$2, float $$3) {
         akt $$4;
         if (!this.j) {
            $$4 = fpr.E;
         } else if (this.a) {
            $$4 = fpr.F;
         } else if (this.A()) {
            $$4 = fpr.G;
         } else {
            $$4 = fpr.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fia var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fmj $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fpr.e {
      private final akt a;

      protected f(int $$0, int $$1, akt $$2, xe $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fia $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fpr.d {
      public g(int $$0, int $$1, ja<brf> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xs b(ja<brf> $$0) {
         return xe.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fpr.this.N != null) {
            this.k = true;
            this.a(fpr.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
