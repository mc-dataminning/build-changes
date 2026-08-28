import javax.annotation.Nullable;

public class cij extends cih implements bvm<ciq> {
   private static final akh<Integer> bY = akl.a(cij.class, akj.b);
   private static final btu bZ = bty.ab.n().a(btt.a().a(bts.a, 0.0F, bty.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cij(bty<? extends cij> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azn $$0) {
      this.g(bvu.s).a((double)a($$0::a));
      this.g(bvu.v).a(b($$0::j));
      this.g(bvu.o).a(a($$0::j));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Variant", this.y());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.a(bY, $$0);
   }

   private int y() {
      return this.am.a(bY);
   }

   private void a(ciq $$0, cil $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ciq q() {
      return ciq.a(this.y() & 0xFF);
   }

   public void a(ciq $$0) {
      this.x($$0.a() & 0xFF | this.y() & -256);
   }

   public cil t() {
      return cil.a((this.y() & 0xFF00) >> 8);
   }

   @Override
   public void a(brl $$0) {
      cvs $$1 = this.fT();
      super.a($$0);
      cvs $$2 = this.fT();
      if (this.ag > 20 && this.k($$2) && $$1 != $$2) {
         this.a(awg.mJ, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dpa $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(awg.mK, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awf w() {
      return awg.mH;
   }

   @Override
   protected awf o_() {
      return awg.mL;
   }

   @Nullable
   @Override
   protected awf gq() {
      return awg.mM;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.mO;
   }

   @Override
   protected awf gP() {
      return awg.mI;
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fT();
      if (!this.bX() && !$$2) {
         cvs $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.n($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gW();
               return brs.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cii) && !($$0 instanceof cij) ? false : this.gY() && ((cih)$$0).gY();
      }
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      if ($$1 instanceof cii) {
         cim $$2 = bty.at.a($$0, btx.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cij $$3 = (cij)$$1;
         cij $$4 = bty.ab.a($$0, btx.e);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            ciq $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ad.a(ciq.values(), this.af);
            }

            int $$9 = this.af.a(5);
            cil $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(cil.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(btz $$0) {
      return true;
   }

   @Override
   public boolean k(cvs $$0) {
      if ($$0.h() instanceof ctk $$1 && $$1.d() == ctk.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      ciq $$5;
      if ($$3 instanceof cij.a) {
         $$5 = ((cij.a)$$3).a;
      } else {
         $$5 = ad.a(ciq.values(), $$4);
         $$3 = new cij.a($$5);
      }

      this.a($$5, ad.a(cil.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends btk.a {
      public final ciq a;

      public a(ciq $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
