public class cer extends cdt {
   private static final afm<Boolean> e = afp.a(cer.class, afo.k);

   public cer(bkm<? extends cer> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cer(crs $$0, bky $$1, double $$2, double $$3, double $$4) {
      super(bkm.bm, $$1, $$2, $$3, $$4, $$0);
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
   public float a(crk $$0, cqy $$1, ht $$2, dgw $$3, ecg $$4, float $$5) {
      return this.w() && bzt.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bki $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof bky $$3) {
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

         if ($$4 && $$1 instanceof bky $$6) {
            int $$7 = 0;
            if (this.dL().ai() == bin.c) {
               $$7 = 10;
            } else if (this.dL().ai() == bin.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bjv(bjx.t, 20 * $$7, 1), this.G());
            }
         }
      }
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.dL().a(this, this.dq(), this.ds(), this.dw(), 1.0F, false, crs.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
