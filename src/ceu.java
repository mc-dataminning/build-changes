public class ceu extends ces {
   public ceu(bku<? extends ceu> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ceu(csa $$0, blg $$1) {
      super(bku.z, $$1, $$0);
   }

   public ceu(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.z, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN()
               .a(
                  new jo(js.O, this.q()),
                  this.ds(),
                  this.du(),
                  this.dy(),
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);
      if (!this.dN().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               bww $$3 = bku.q.a(this.dN());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
                  this.dN().b($$3);
               }
            }
         }

         this.dN().a(this, (byte)3);
         this.am();
      }
   }

   @Override
   protected cle s() {
      return clm.qO;
   }
}
