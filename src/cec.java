public class cec extends cde {
   private static final afc<Boolean> e = aff.a(cec.class, afe.k);

   public cec(bjx<? extends cec> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cec(cqz $$0, bkj $$1, double $$2, double $$3, double $$4) {
      super(bjx.bm, $$1, $$2, $$3, $$4, $$0);
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
   public float a(cqr $$0, cqf $$1, ht $$2, dgb $$3, ebe $$4, float $$5) {
      return this.w() && bze.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(eic $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bjt $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof bkj $$3) {
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

         if ($$4 && $$1 instanceof bkj $$6) {
            int $$7 = 0;
            if (this.dL().ai() == bhy.c) {
               $$7 = 10;
            } else if (this.dL().ai() == bhy.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bjg(bji.t, 20 * $$7, 1), this.G());
            }
         }
      }
   }

   @Override
   protected void a(eid $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, this.dq(), this.ds(), this.dw(), 1.0F, false, cqz.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      return false;
   }

   @Override
   protected void b_() {
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
   protected boolean af_() {
      return false;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
