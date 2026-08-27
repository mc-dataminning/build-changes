import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fmf extends fmb<cog> {
   private static final akh D = new akh("textures/gui/container/beacon.png");
   static final akh E = new akh("container/beacon/button_disabled");
   static final akh F = new akh("container/beacon/button_selected");
   static final akh G = new akh("container/beacon/button_highlighted");
   static final akh H = new akh("container/beacon/button");
   static final akh I = new akh("container/beacon/confirm");
   static final akh J = new akh("container/beacon/cancel");
   private static final wu K = wu.c("block.minecraft.beacon.primary");
   private static final wu L = wu.c("block.minecraft.beacon.secondary");
   private final List<fmf.a> M = Lists.newArrayList();
   @Nullable
   iw<bqr> N;
   @Nullable
   iw<bqr> O;

   public fmf(final cog $$0, clg $$1, wu $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new coq() {
         @Override
         public void a(cod $$0x, int $$1, csz $$2) {
         }

         @Override
         public void a(cod $$0x, int $$1, int $$2) {
            fmf.this.N = $$0.m();
            fmf.this.O = $$0.n();
         }
      });
   }

   private <T extends ffc & fmf.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.M.clear();
      this.a(new fmf.c(this.z + 164, this.A + 107));
      this.a(new fmf.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dnh.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            iw<bqr> $$4 = dnh.a.get($$0).get($$3);
            fmf.d $$5 = new fmf.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dnh.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         iw<bqr> $$10 = dnh.a.get(3).get($$9);
         fmf.d $$11 = new fmf.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      iw<bqr> $$12 = dnh.a.get(0).get(0);
      fmf.d $$13 = new fmf.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
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
   protected void b(fer $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fer $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new csz(ctc.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new csz(ctc.oz), $$4 + 41, $$5 + 109);
      $$0.a(new csz(ctc.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new csz(ctc.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new csz(ctc.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fmf.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fmf.J, wt.e);
      }

      @Override
      public void b() {
         fmf.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fmf.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fmf.I, wt.d);
      }

      @Override
      public void b() {
         fmf.this.m.L().b(new ahk(Optional.ofNullable(fmf.this.N), Optional.ofNullable(fmf.this.O)));
         fmf.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fmf.this.w.o() && fmf.this.N != null;
      }
   }

   class d extends fmf.e {
      private final boolean c;
      protected final int a;
      private iw<bqr> d;
      private gmy f;

      public d(int $$0, int $$1, iw<bqr> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(iw<bqr> $$0) {
         this.d = $$0;
         this.f = fde.Q().aG().a($$0);
         this.a(fgp.a(this.b($$0), null));
      }

      protected xi b(iw<bqr> $$0) {
         return wu.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fmf.this.N = this.d;
            } else {
               fmf.this.O = this.d;
            }

            fmf.this.E();
         }
      }

      @Override
      protected void a(fer $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fmf.this.N : fmf.this.O));
      }

      @Override
      protected xi aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fev implements fmf.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wt.a);
      }

      protected e(int $$0, int $$1, wu $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fer $$0, int $$1, int $$2, float $$3) {
         akh $$4;
         if (!this.j) {
            $$4 = fmf.E;
         } else if (this.a) {
            $$4 = fmf.F;
         } else if (this.A()) {
            $$4 = fmf.G;
         } else {
            $$4 = fmf.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fer var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fja $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fmf.e {
      private final akh a;

      protected f(int $$0, int $$1, akh $$2, wu $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fer $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fmf.d {
      public g(int $$0, int $$1, iw<bqr> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xi b(iw<bqr> $$0) {
         return wu.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fmf.this.N != null) {
            this.k = true;
            this.a(fmf.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
