public class ccn extends ccl {
   public ccn(bim<? extends ccn> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccn(cpm $$0, biy $$1) {
      super(bim.z, $$1, $$0);
   }

   public ccn(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.z, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dK()
               .a(
                  new ir(iv.O, this.j()),
                  this.dp(),
                  this.dr(),
                  this.dv(),
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      $$0.a().a(this.dL().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (!this.dK().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               bup $$3 = bim.q.a(this.dK());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
                  this.dK().b($$3);
               }
            }
         }

         this.dK().a(this, (byte)3);
         this.ak();
      }
   }

   @Override
   protected cit m() {
      return cjb.qd;
   }
}
