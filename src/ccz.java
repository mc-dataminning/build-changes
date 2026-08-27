public class ccz extends ccb {
   private static final aee<Boolean> e = aeh.a(ccz.class, aeg.k);

   public ccz(biu<? extends ccz> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccz(cpv $$0, bjg $$1, double $$2, double $$3, double $$4) {
      super(biu.bm, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float t() {
      return this.w() ? 0.73F : super.t();
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   public float a(cpn $$0, cpb $$1, gw $$2, dfj $$3, eam $$4, float $$5) {
      return this.w() && byb.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ehk $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biq $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof bjg $$3) {
            $$4 = $$1.a(this.dM().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bv()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dM().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bjg $$6) {
            int $$7 = 0;
            if (this.dL().ai() == bgv.c) {
               $$7 = 10;
            } else if (this.dL().ai() == bgv.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bid(bif.t, 20 * $$7, 1), this.G());
            }
         }
      }
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, this.dq(), this.ds(), this.dw(), 1.0F, false, cpv.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      return false;
   }

   @Override
   protected void a_() {
      this.an.a(e, false);
   }

   @Override
   public boolean w() {
      return this.an.b(e);
   }

   public void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   protected boolean ae_() {
      return false;
   }
}
