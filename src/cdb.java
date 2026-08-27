public class cdb extends ccd {
   private static final aeg<Boolean> e = aej.a(cdb.class, aei.k);

   public cdb(biw<? extends cdb> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cdb(cpx $$0, bji $$1, double $$2, double $$3, double $$4) {
      super(biw.bm, $$1, $$2, $$3, $$4, $$0);
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
   public float a(cpp $$0, cpd $$1, gw $$2, dfl $$3, eao $$4, float $$5) {
      return this.w() && byd.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bis $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof bji $$3) {
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

         if ($$4 && $$1 instanceof bji $$6) {
            int $$7 = 0;
            if (this.dL().ai() == bgx.c) {
               $$7 = 10;
            } else if (this.dL().ai() == bgx.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bif(bih.t, 20 * $$7, 1), this.G());
            }
         }
      }
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, this.dq(), this.ds(), this.dw(), 1.0F, false, cpx.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
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
