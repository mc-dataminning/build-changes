public class cgh extends cgf {
   public cgh(bly<? extends cgh> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgh(cto $$0, bmk $$1) {
      super(bly.A, $$1, $$0);
   }

   public cgh(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.A, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM()
               .a(
                  new jt(jx.Q, this.q()),
                  this.dr(),
                  this.dt(),
                  this.dx(),
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               byc $$3 = bly.r.a(this.dM());
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
   protected cms s() {
      return cna.qO;
   }
}
