import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fag extends fac<cfs> {
   private static final afw x = new afw("textures/gui/container/beacon.png");
   static final afw y = new afw("container/beacon/button_disabled");
   static final afw z = new afw("container/beacon/button_selected");
   static final afw A = new afw("container/beacon/button_highlighted");
   static final afw B = new afw("container/beacon/button");
   static final afw C = new afw("container/beacon/confirm");
   static final afw D = new afw("container/beacon/cancel");
   private static final ui E = ui.c("block.minecraft.beacon.primary");
   private static final ui F = ui.c("block.minecraft.beacon.secondary");
   private final List<fag.a> G = Lists.newArrayList();
   @Nullable
   bje H;
   @Nullable
   bje I;

   public fag(final cfs $$0, ccw $$1, ui $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cgb() {
         @Override
         public void a(cfp $$0x, int $$1, ckj $$2) {
         }

         @Override
         public void a(cfp $$0x, int $$1, int $$2) {
            fag.this.H = $$0.m();
            fag.this.I = $$0.n();
         }
      });
   }

   private <T extends eth & fag.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.G.clear();
      this.a(new fag.c(this.t + 164, this.u + 107));
      this.a(new fag.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dds.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bje $$4 = dds.a[$$0][$$3];
            fag.d $$5 = new fag.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dds.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bje $$10 = dds.a[3][$$9];
         fag.d $$11 = new fag.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      fag.d $$12 = new fag.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dds.a[0][0]);
      $$12.j = false;
      this.a($$12);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(esy $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(esy $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new ckj(ckm.nV), $$4 + 20, $$5 + 109);
      $$0.a(new ckj(ckm.nL), $$4 + 41, $$5 + 109);
      $$0.a(new ckj(ckm.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new ckj(ckm.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new ckj(ckm.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fag.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fag.D, uh.e);
      }

      @Override
      public void c() {
         fag.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fag.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fag.C, uh.d);
      }

      @Override
      public void c() {
         fag.this.f.J().b(new adk(Optional.ofNullable(fag.this.H), Optional.ofNullable(fag.this.I)));
         fag.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
         this.i = fag.this.p.o() && fag.this.H != null;
      }
   }

   class d extends fag.e {
      private final boolean c;
      protected final int a;
      private bje d;
      private gaa l;

      public d(int $$0, int $$1, bje $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bje $$0) {
         this.d = $$0;
         this.l = ero.O().aE().a($$0);
         this.a(euu.a(this.b($$0), null));
      }

      protected uw b(bje $$0) {
         return ui.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               fag.this.H = this.d;
            } else {
               fag.this.I = this.d;
            }

            fag.this.E();
         }
      }

      @Override
      protected void a(esy $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? fag.this.H : fag.this.I));
      }

      @Override
      protected uw aI_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends etb implements fag.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, uh.a);
      }

      protected e(int $$0, int $$1, ui $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         afw $$4;
         if (!this.i) {
            $$4 = fag.y;
         } else if (this.a) {
            $$4 = fag.z;
         } else if (this.n()) {
            $$4 = fag.A;
         } else {
            $$4 = fag.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(esy var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(exc $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fag.e {
      private final afw a;

      protected f(int $$0, int $$1, afw $$2, ui $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(esy $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends fag.d {
      public g(int $$0, int $$1, bje $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected uw b(bje $$0) {
         return ui.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fag.this.H != null) {
            this.j = true;
            this.a(fag.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
