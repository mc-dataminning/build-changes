import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fbx extends fbt<cgp> {
   private static final agi x = new agi("textures/gui/container/beacon.png");
   static final agi y = new agi("container/beacon/button_disabled");
   static final agi z = new agi("container/beacon/button_selected");
   static final agi A = new agi("container/beacon/button_highlighted");
   static final agi B = new agi("container/beacon/button");
   static final agi C = new agi("container/beacon/confirm");
   static final agi D = new agi("container/beacon/cancel");
   private static final ur E = ur.c("block.minecraft.beacon.primary");
   private static final ur F = ur.c("block.minecraft.beacon.secondary");
   private final List<fbx.a> G = Lists.newArrayList();
   @Nullable
   bkb H;
   @Nullable
   bkb I;

   public fbx(final cgp $$0, cdt $$1, ur $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cgy() {
         @Override
         public void a(cgm $$0x, int $$1, clj $$2) {
         }

         @Override
         public void a(cgm $$0x, int $$1, int $$2) {
            fbx.this.H = $$0.m();
            fbx.this.I = $$0.n();
         }
      });
   }

   private <T extends eux & fbx.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.G.clear();
      this.a(new fbx.c(this.t + 164, this.u + 107));
      this.a(new fbx.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dey.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bkb $$4 = dey.a[$$0][$$3];
            fbx.d $$5 = new fbx.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dey.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bkb $$10 = dey.a[3][$$9];
         fbx.d $$11 = new fbx.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      fbx.d $$12 = new fbx.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dey.a[0][0]);
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
   protected void b(euo $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new clj(clm.oG), $$4 + 20, $$5 + 109);
      $$0.a(new clj(clm.ow), $$4 + 41, $$5 + 109);
      $$0.a(new clj(clm.ov), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new clj(clm.oF), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new clj(clm.oB), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fbx.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fbx.D, uq.e);
      }

      @Override
      public void b() {
         fbx.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fbx.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fbx.C, uq.d);
      }

      @Override
      public void b() {
         fbx.this.f.I().b(new adw(Optional.ofNullable(fbx.this.H), Optional.ofNullable(fbx.this.I)));
         fbx.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.i = fbx.this.p.o() && fbx.this.H != null;
      }
   }

   class d extends fbx.e {
      private final boolean c;
      protected final int a;
      private bkb d;
      private gbu l;

      public d(int $$0, int $$1, bkb $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bkb $$0) {
         this.d = $$0;
         this.l = etd.N().aD().a($$0);
         this.a(ewk.a(this.b($$0), null));
      }

      protected vf b(bkb $$0) {
         return ur.c($$0.d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fbx.this.H = this.d;
            } else {
               fbx.this.I = this.d;
            }

            fbx.this.E();
         }
      }

      @Override
      protected void a(euo $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? fbx.this.H : fbx.this.I));
      }

      @Override
      protected vf aM_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends eur implements fbx.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, uq.a);
      }

      protected e(int $$0, int $$1, ur $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(euo $$0, int $$1, int $$2, float $$3) {
         agi $$4;
         if (!this.i) {
            $$4 = fbx.y;
         } else if (this.a) {
            $$4 = fbx.z;
         } else if (this.n()) {
            $$4 = fbx.A;
         } else {
            $$4 = fbx.B;
         }

         $$0.a($$4, this.p(), this.r(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(euo var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(eys $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fbx.e {
      private final agi a;

      protected f(int $$0, int $$1, agi $$2, ur $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(euo $$0) {
         $$0.a(this.a, this.p() + 2, this.r() + 2, 18, 18);
      }
   }

   class g extends fbx.d {
      public g(int $$0, int $$1, bkb $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vf b(bkb $$0) {
         return ur.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fbx.this.H != null) {
            this.j = true;
            this.a(fbx.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
