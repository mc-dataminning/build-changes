public class cjb extends ciz {
   public cjb(bol<? extends cjb> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cjb(cwe $$0, box $$1) {
      super(bol.B, $$1, $$0);
   }

   public cjb(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.B, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dJ()
               .a(
                  new jx(kb.Q, this.q()),
                  this.do(),
                  this.dq(),
                  this.du(),
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      $$0.a().a(this.dK().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         if (this.af.a(8) == 0) {
            int $$1 = 1;
            if (this.af.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               car $$3 = bol.s.a(this.dJ());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.do(), this.dq(), this.du(), this.dz(), 0.0F);
                  this.dJ().b($$3);
               }
            }
         }

         this.dJ().a(this, (byte)3);
         this.am();
      }
   }

   @Override
   protected cpl s() {
      return cpt.qQ;
   }
}
