public class ccq extends cbs {
   private static final adx<Boolean> e = aea.a(ccq.class, adz.k);

   public ccq(bik<? extends ccq> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccq(cpk $$0, biw $$1, double $$2, double $$3, double $$4) {
      super(bik.bm, $$1, $$2, $$3, $$4, $$0);
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
   public float a(cpc $$0, coq $$1, gv $$2, dey $$3, eab $$4, float $$5) {
      return this.p() && bxs.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         big $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof biw $$3) {
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

         if ($$4 && $$1 instanceof biw $$6) {
            int $$7 = 0;
            if (this.dK().ai() == bgl.c) {
               $$7 = 10;
            } else if (this.dK().ai() == bgl.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bht(bhv.t, 20 * $$7, 1), this.A());
            }
         }
      }
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, this.dp(), this.dr(), this.dv(), 1.0F, false, cpk.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
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
