import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fof extends fob<cpx> {
   private static final alf D = new alf("textures/gui/container/beacon.png");
   static final alf E = new alf("container/beacon/button_disabled");
   static final alf F = new alf("container/beacon/button_selected");
   static final alf G = new alf("container/beacon/button_highlighted");
   static final alf H = new alf("container/beacon/button");
   static final alf I = new alf("container/beacon/confirm");
   static final alf J = new alf("container/beacon/cancel");
   private static final xp K = xp.c("block.minecraft.beacon.primary");
   private static final xp L = xp.c("block.minecraft.beacon.secondary");
   private final List<fof.a> M = Lists.newArrayList();
   @Nullable
   ji<bsa> N;
   @Nullable
   ji<bsa> O;

   public fof(final cpx $$0, cmw $$1, xp $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cqg() {
         @Override
         public void a(cpu $$0x, int $$1, cup $$2) {
         }

         @Override
         public void a(cpu $$0x, int $$1, int $$2) {
            fof.this.N = $$0.m();
            fof.this.O = $$0.n();
         }
      });
   }

   private <T extends fhc & fof.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.M.clear();
      this.a(new fof.c(this.z + 164, this.A + 107));
      this.a(new fof.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dpc.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ji<bsa> $$4 = dpc.a.get($$0).get($$3);
            fof.d $$5 = new fof.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dpc.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ji<bsa> $$10 = dpc.a.get(3).get($$9);
         fof.d $$11 = new fof.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ji<bsa> $$12 = dpc.a.get(0).get(0);
      fof.d $$13 = new fof.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
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
   protected void b(fgr $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fgr $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cup(cus.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new cup(cus.oz), $$4 + 41, $$5 + 109);
      $$0.a(new cup(cus.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cup(cus.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cup(cus.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fof.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fof.J, xo.e);
      }

      @Override
      public void b() {
         fof.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fof.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fof.I, xo.d);
      }

      @Override
      public void b() {
         fof.this.m.L().b(new aii(Optional.ofNullable(fof.this.N), Optional.ofNullable(fof.this.O)));
         fof.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fof.this.w.o() && fof.this.N != null;
      }
   }

   class d extends fof.e {
      private final boolean c;
      protected final int a;
      private ji<bsa> d;
      private goz f;

      public d(final int $$0, final int $$1, final ji<bsa> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ji<bsa> $$0) {
         this.d = $$0;
         this.f = fff.Q().aF().a($$0);
         this.a(fip.a(this.b($$0), null));
      }

      protected yd b(ji<bsa> $$0) {
         return xp.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fof.this.N = this.d;
            } else {
               fof.this.O = this.d;
            }

            fof.this.I();
         }
      }

      @Override
      protected void a(fgr $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fof.this.N : fof.this.O));
      }

      @Override
      protected yd aJ_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fgv implements fof.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xo.a);
      }

      protected e(int $$0, int $$1, xp $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fgr $$0, int $$1, int $$2, float $$3) {
         alf $$4;
         if (!this.j) {
            $$4 = fof.E;
         } else if (this.a) {
            $$4 = fof.F;
         } else if (this.A()) {
            $$4 = fof.G;
         } else {
            $$4 = fof.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fgr var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fla $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fof.e {
      private final alf a;

      protected f(int $$0, int $$1, alf $$2, xp $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fgr $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fof.d {
      public g(final int $$0, final int $$1, final ji<bsa> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected yd b(ji<bsa> $$0) {
         return xp.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fof.this.N != null) {
            this.k = true;
            this.a(fof.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
