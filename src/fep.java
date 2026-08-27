import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fep extends fel<cim> {
   private static final ahh x = new ahh("textures/gui/container/beacon.png");
   static final ahh y = new ahh("container/beacon/button_disabled");
   static final ahh z = new ahh("container/beacon/button_selected");
   static final ahh A = new ahh("container/beacon/button_highlighted");
   static final ahh B = new ahh("container/beacon/button");
   static final ahh C = new ahh("container/beacon/confirm");
   static final ahh D = new ahh("container/beacon/cancel");
   private static final vg E = vg.c("block.minecraft.beacon.primary");
   private static final vg F = vg.c("block.minecraft.beacon.secondary");
   private final List<fep.a> G = Lists.newArrayList();
   @Nullable
   ih<blh> H;
   @Nullable
   ih<blh> I;

   public fep(final cim $$0, cfp $$1, vg $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new civ() {
         @Override
         public void a(cij $$0x, int $$1, cng $$2) {
         }

         @Override
         public void a(cij $$0x, int $$1, int $$2) {
            fep.this.H = $$0.m();
            fep.this.I = $$0.n();
         }
      });
   }

   private <T extends exp & fep.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.G.clear();
      this.a(new fep.c(this.t + 164, this.u + 107));
      this.a(new fep.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dgy.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ih<blh> $$4 = dgy.a.get($$0).get($$3);
            fep.d $$5 = new fep.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dgy.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ih<blh> $$10 = dgy.a.get(3).get($$9);
         fep.d $$11 = new fep.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ih<blh> $$12 = dgy.a.get(0).get(0);
      fep.d $$13 = new fep.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void E() {
      super.E();
      this.I();
   }

   void I() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(exe $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(exe $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cng(cnj.oI), $$4 + 20, $$5 + 109);
      $$0.a(new cng(cnj.oy), $$4 + 41, $$5 + 109);
      $$0.a(new cng(cnj.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cng(cnj.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cng(cnj.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fep.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fep.D, vf.e);
      }

      @Override
      public void b() {
         fep.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fep.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fep.C, vf.d);
      }

      @Override
      public void b() {
         fep.this.f.J().b(new aev(Optional.ofNullable(fep.this.H), Optional.ofNullable(fep.this.I)));
         fep.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fep.this.p.o() && fep.this.H != null;
      }
   }

   class d extends fep.e {
      private final boolean c;
      protected final int a;
      private ih<blh> d;
      private gfb f;

      public d(int $$0, int $$1, ih<blh> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ih<blh> $$0) {
         this.d = $$0;
         this.f = evr.O().aE().a($$0);
         this.a(ezc.a(this.b($$0), null));
      }

      protected vu b(ih<blh> $$0) {
         return vg.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fep.this.H = this.d;
            } else {
               fep.this.I = this.d;
            }

            fep.this.I();
         }
      }

      @Override
      protected void a(exe $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fep.this.H : fep.this.I));
      }

      @Override
      protected vu aM_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends exi implements fep.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, vf.a);
      }

      protected e(int $$0, int $$1, vg $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(exe $$0, int $$1, int $$2, float $$3) {
         ahh $$4;
         if (!this.j) {
            $$4 = fep.y;
         } else if (this.a) {
            $$4 = fep.z;
         } else if (this.z()) {
            $$4 = fep.A;
         } else {
            $$4 = fep.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(exe var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fbk $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fep.e {
      private final ahh a;

      protected f(int $$0, int $$1, ahh $$2, vg $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(exe $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fep.d {
      public g(int $$0, int $$1, ih<blh> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vu b(ih<blh> $$0) {
         return vg.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fep.this.H != null) {
            this.k = true;
            this.a(fep.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
