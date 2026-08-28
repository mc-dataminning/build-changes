import javax.annotation.Nullable;

public class cig extends cie implements bvj<cin> {
   private static final akg<Integer> bY = akk.a(cig.class, aki.b);
   private static final btr bZ = btv.ab.n().a(btq.a().a(btp.a, 0.0F, btv.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cig(btv<? extends cig> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azl $$0) {
      this.g(bvr.s).a((double)a($$0::a));
      this.g(bvr.v).a(b($$0::j));
      this.g(bvr.o).a(a($$0::j));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.y());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.a(bY, $$0);
   }

   private int y() {
      return this.am.a(bY);
   }

   private void a(cin $$0, cii $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cin q() {
      return cin.a(this.y() & 0xFF);
   }

   public void a(cin $$0) {
      this.x($$0.a() & 0xFF | this.y() & -256);
   }

   public cii t() {
      return cii.a((this.y() & 0xFF00) >> 8);
   }

   @Override
   public void a(bri $$0) {
      cvp $$1 = this.fT();
      super.a($$0);
      cvp $$2 = this.fT();
      if (this.ag > 20 && this.k($$2) && $$1 != $$2) {
         this.a(awe.mJ, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dox $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(awe.mK, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awd w() {
      return awe.mH;
   }

   @Override
   protected awd n_() {
      return awe.mL;
   }

   @Nullable
   @Override
   protected awd gr() {
      return awe.mM;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.mO;
   }

   @Override
   protected awd gQ() {
      return awe.mI;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      boolean $$2 = !this.o_() && this.gG() && $$0.fS();
      if (!this.bX() && !$$2) {
         cvp $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.n($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gG()) {
               this.gX();
               return brp.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cga $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cif) && !($$0 instanceof cig) ? false : this.gZ() && ((cie)$$0).gZ();
      }
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      if ($$1 instanceof cif) {
         cij $$2 = btv.at.a($$0, btu.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cig $$3 = (cig)$$1;
         cig $$4 = btv.ab.a($$0, btu.e);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            cin $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ad.a(cin.values(), this.af);
            }

            int $$9 = this.af.a(5);
            cii $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(cii.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(btw $$0) {
      return true;
   }

   @Override
   public boolean k(cvp $$0) {
      if ($$0.h() instanceof cth $$1 && $$1.d() == cth.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      cin $$5;
      if ($$3 instanceof cig.a) {
         $$5 = ((cig.a)$$3).a;
      } else {
         $$5 = ad.a(cin.values(), $$4);
         $$3 = new cig.a($$5);
      }

      this.a($$5, ad.a(cii.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? bZ : super.e($$0);
   }

   public static class a extends bth.a {
      public final cin a;

      public a(cin $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
