import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class foc extends fny<cpl> {
   private static final akk D = new akk("textures/gui/container/beacon.png");
   static final akk E = new akk("container/beacon/button_disabled");
   static final akk F = new akk("container/beacon/button_selected");
   static final akk G = new akk("container/beacon/button_highlighted");
   static final akk H = new akk("container/beacon/button");
   static final akk I = new akk("container/beacon/confirm");
   static final akk J = new akk("container/beacon/cancel");
   private static final wu K = wu.c("block.minecraft.beacon.primary");
   private static final wu L = wu.c("block.minecraft.beacon.secondary");
   private final List<foc.a> M = Lists.newArrayList();
   @Nullable
   jj<brm> N;
   @Nullable
   jj<brm> O;

   public foc(final cpl $$0, cmj $$1, wu $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.q = 219;
      $$0.a(new cpu() {
         @Override
         public void a(cph $$0x, int $$1, cuc $$2) {
         }

         @Override
         public void a(cph $$0x, int $$1, int $$2) {
            foc.this.N = $$0.m();
            foc.this.O = $$0.n();
         }
      });
   }

   private <T extends fhq & foc.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.M.clear();
      this.a(new foc.c(this.z + 164, this.A + 107));
      this.a(new foc.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dpk.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jj<brm> $$4 = dpk.a.get($$0).get($$3);
            foc.d $$5 = new foc.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dpk.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jj<brm> $$10 = dpk.a.get(3).get($$9);
         foc.d $$11 = new foc.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jj<brm> $$12 = dpk.a.get(0).get(0);
      foc.d $$13 = new foc.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void E() {
      super.E();
      this.G();
   }

   void G() {
      int $$0 = this.w.l();
      this.M.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fhf $$0, int $$1, int $$2) {
      $$0.a(this.o, K, 62, 10, 14737632);
      $$0.a(this.o, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fhf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.q);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cuc(cuf.oK), $$4 + 20, $$5 + 109);
      $$0.a(new cuc(cuf.oA), $$4 + 41, $$5 + 109);
      $$0.a(new cuc(cuf.oz), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cuc(cuf.oJ), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cuc(cuf.oF), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends foc.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, foc.J, wt.e);
      }

      @Override
      public void b() {
         foc.this.l.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends foc.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, foc.I, wt.d);
      }

      @Override
      public void b() {
         foc.this.l.L().b(new ahn(Optional.ofNullable(foc.this.N), Optional.ofNullable(foc.this.O)));
         foc.this.l.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = foc.this.w.o() && foc.this.N != null;
      }
   }

   class d extends foc.e {
      private final boolean c;
      protected final int a;
      private jj<brm> d;
      private gpo f;

      public d(final int $$0, final int $$1, final jj<brm> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jj<brm> $$0) {
         this.d = $$0;
         this.f = fft.Q().aF().a($$0);
         this.a(fjd.a(this.b($$0), null));
      }

      protected xi b(jj<brm> $$0) {
         return wu.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               foc.this.N = this.d;
            } else {
               foc.this.O = this.d;
            }

            foc.this.G();
         }
      }

      @Override
      protected void a(fhf $$0) {
         $$0.a(this.D() + 2, this.E() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? foc.this.N : foc.this.O));
      }

      @Override
      protected xi aM_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fhj implements foc.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wt.a);
      }

      protected e(int $$0, int $$1, wu $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fhf $$0, int $$1, int $$2, float $$3) {
         akk $$4;
         if (!this.j) {
            $$4 = foc.E;
         } else if (this.a) {
            $$4 = foc.F;
         } else if (this.B()) {
            $$4 = foc.G;
         } else {
            $$4 = foc.H;
         }

         $$0.a($$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fhf var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(flo $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends foc.e {
      private final akk a;

      protected f(int $$0, int $$1, akk $$2, wu $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fhf $$0) {
         $$0.a(this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends foc.d {
      public g(final int $$0, final int $$1, final jj<brm> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xi b(jj<brm> $$0) {
         return wu.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (foc.this.N != null) {
            this.k = true;
            this.a(foc.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
