public class cjv extends cjt {
   public cjv(bpd<? extends cjv> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjv(cxb $$0, bpp $$1) {
      super(bpd.D, $$1, $$0);
   }

   public cjv(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.D, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dM()
               .a(
                  new jy(kc.R, this.p()),
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
   protected void a(epq $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.af_()), 0.0F);
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cbj $$3 = bpd.u.a(this.dM());
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
   protected cqh r() {
      return cqp.qQ;
   }
}
