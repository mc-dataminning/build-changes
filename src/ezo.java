import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezo extends ezk<ceq> {
   private static final aey x = new aey("textures/gui/container/beacon.png");
   static final aey y = new aey("container/beacon/button_disabled");
   static final aey z = new aey("container/beacon/button_selected");
   static final aey A = new aey("container/beacon/button_highlighted");
   static final aey B = new aey("container/beacon/button");
   static final aey C = new aey("container/beacon/confirm");
   static final aey D = new aey("container/beacon/cancel");
   private static final tn E = tn.c("block.minecraft.beacon.primary");
   private static final tn F = tn.c("block.minecraft.beacon.secondary");
   private final List<ezo.a> G = Lists.newArrayList();
   @Nullable
   bid H;
   @Nullable
   bid I;

   public ezo(final ceq $$0, cbv $$1, tn $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cez() {
         @Override
         public void a(cen $$0x, int $$1, cjh $$2) {
         }

         @Override
         public void a(cen $$0x, int $$1, int $$2) {
            ezo.this.H = $$0.m();
            ezo.this.I = $$0.n();
         }
      });
   }

   private <T extends esq & ezo.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.G.clear();
      this.a(new ezo.c(this.t + 164, this.u + 107));
      this.a(new ezo.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dcs.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bid $$4 = dcs.a[$$0][$$3];
            ezo.d $$5 = new ezo.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.i = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dcs.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bid $$10 = dcs.a[3][$$9];
         ezo.d $$11 = new ezo.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.i = false;
         this.a($$11);
      }

      ezo.d $$12 = new ezo.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dcs.a[0][0]);
      $$12.j = false;
      this.a($$12);
   }

   @Override
   public void D() {
      super.D();
      this.F();
   }

   void F() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(esh $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(esh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cjh(cjk.nV), $$4 + 20, $$5 + 109);
      $$0.a(new cjh(cjk.nL), $$4 + 41, $$5 + 109);
      $$0.a(new cjh(cjk.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cjh(cjk.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cjh(cjk.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends ezo.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, ezo.D, tm.e);
      }

      @Override
      public void c() {
         ezo.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends ezo.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, ezo.C, tm.d);
      }

      @Override
      public void c() {
         ezo.this.f.J().b(new aco(Optional.ofNullable(ezo.this.H), Optional.ofNullable(ezo.this.I)));
         ezo.this.f.s.q();
      }

      @Override
      public void a(int $$0) {
         this.i = ezo.this.p.o() && ezo.this.H != null;
      }
   }

   class d extends ezo.e {
      private final boolean c;
      protected final int a;
      private bid d;
      private fzg l;

      public d(int $$0, int $$1, bid $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bid $$0) {
         this.d = $$0;
         this.l = eqx.O().aE().a($$0);
         this.a(euc.a(this.b($$0), null));
      }

      protected ua b(bid $$0) {
         return tn.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               ezo.this.H = this.d;
            } else {
               ezo.this.I = this.d;
            }

            ezo.this.F();
         }
      }

      @Override
      protected void a(esh $$0) {
         $$0.a(this.r() + 2, this.t() + 2, 0, 18, 18, this.l);
      }

      @Override
      public void a(int $$0) {
         this.i = this.a < $$0;
         this.b(this.d == (this.c ? ezo.this.H : ezo.this.I));
      }

      @Override
      protected ua aE_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends esk implements ezo.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, tm.a);
      }

      protected e(int $$0, int $$1, tn $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         aey $$4;
         if (!this.i) {
            $$4 = ezo.y;
         } else if (this.a) {
            $$4 = ezo.z;
         } else if (this.o()) {
            $$4 = ezo.A;
         } else {
            $$4 = ezo.B;
         }

         $$0.a($$4, this.r(), this.t(), this.f, this.g);
         this.a($$0);
      }

      protected abstract void a(esh var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ewk $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends ezo.e {
      private final aey a;

      protected f(int $$0, int $$1, aey $$2, tn $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(esh $$0) {
         $$0.a(this.a, this.r() + 2, this.t() + 2, 18, 18);
      }
   }

   class g extends ezo.d {
      public g(int $$0, int $$1, bid $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected ua b(bid $$0) {
         return tn.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (ezo.this.H != null) {
            this.j = true;
            this.a(ezo.this.H);
            super.a($$0);
         } else {
            this.j = false;
         }
      }
   }
}
