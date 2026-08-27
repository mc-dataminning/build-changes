public class ccu extends cbw {
   private static final aec<Boolean> e = aef.a(ccu.class, aee.k);

   public ccu(bip<? extends ccu> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccu(cpq $$0, bjb $$1, double $$2, double $$3, double $$4) {
      super(bip.bm, $$1, $$2, $$3, $$4, $$0);
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
   public float a(cpi $$0, cow $$1, gw $$2, dfe $$3, eah $$4, float $$5) {
      return this.p() && bxw.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bil $$1 = $$0.a();
         boolean $$4;
         if (this.v() instanceof bjb $$3) {
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

         if ($$4 && $$1 instanceof bjb $$6) {
            int $$7 = 0;
            if (this.dK().ai() == bgq.c) {
               $$7 = 10;
            } else if (this.dK().ai() == bgq.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bhy(bia.t, 20 * $$7, 1), this.A());
            }
         }
      }
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.dK().a(this, this.dp(), this.dr(), this.dv(), 1.0F, false, cpq.a.c);
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
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
   protected boolean Z_() {
      return false;
   }
}
