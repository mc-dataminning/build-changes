public class cjh extends cih {
   private static final aii<Boolean> e = ail.a(cjh.class, aik.k);

   public cjh(bol<? extends cjh> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cjh(cwe $$0, box $$1, double $$2, double $$3, double $$4) {
      super(bol.bp, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float x() {
      return this.z() ? 0.73F : super.x();
   }

   @Override
   public boolean bK() {
      return false;
   }

   @Override
   public float a(cvw $$0, cvk $$1, ib $$2, dme $$3, ehr $$4, float $$5) {
      return this.z() && cdz.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         bof $$1 = $$0.a();
         boolean $$4;
         if (this.w() instanceof box $$3) {
            $$4 = $$1.a(this.dK().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bx()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dK().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof box $$6) {
            int $$7 = 0;
            if (this.dJ().aj() == bmi.c) {
               $$7 = 10;
            } else if (this.dJ().aj() == bmi.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bns(bnu.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.dJ().a(this, this.do(), this.dq(), this.du(), 1.0F, false, cwe.a.c);
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return false;
   }

   @Override
   protected void c_() {
      this.am.a(e, false);
   }

   public boolean z() {
      return this.am.b(e);
   }

   public void a(boolean $$0) {
      this.am.b(e, $$0);
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("dangerous", this.z());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
