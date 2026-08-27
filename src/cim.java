public class cim extends cik {
   public cim(bnw<? extends cim> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cim(cvr $$0, boi $$1) {
      super(bnw.B, $$1, $$0);
   }

   public cim(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.B, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM()
               .a(
                  new jv(jz.Q, this.q()),
                  this.dr(),
                  this.dt(),
                  this.dx(),
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         if (this.af.a(8) == 0) {
            int $$1 = 1;
            if (this.af.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cac $$3 = bnw.s.a(this.dM());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
                  this.dM().b($$3);
               }
            }
         }

         this.dM().a(this, (byte)3);
         this.am();
      }
   }

   @Override
   protected coy s() {
      return cpg.qQ;
   }
}
