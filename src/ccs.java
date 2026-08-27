public class ccs extends cbu {
   private static final adz<Boolean> e = aec.a(ccs.class, aeb.k);

   public ccs(bim<? extends ccs> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccs(cpm $$0, biy $$1, double $$2, double $$3, double $$4) {
      super(bim.bm, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float o() {
      return this.p() ? 0.73F : super.o();
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   public float a(cpe $$0, cos $$1, gu $$2, dfa $$3, ead $$4, float $$5) {
      return this.p() && bxu.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bii $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof biy $$3) {
            $$4 = $$1.a(this.dL().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bv()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dL().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof biy $$6) {
            int $$7 = 0;
            if (this.dK().ai() == bgn.c) {
               $$7 = 10;
            } else if (this.dK().ai() == bgn.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bhv(bhx.t, 20 * $$7, 1), this.A());
            }
         }
      }
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, this.dp(), this.dr(), this.dv(), 1.0F, false, cpm.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      return false;
   }

   @Override
   protected void a_() {
      this.an.a(e, false);
   }

   @Override
   public boolean p() {
      return this.an.b(e);
   }

   public void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   protected boolean aa_() {
      return false;
   }
}
