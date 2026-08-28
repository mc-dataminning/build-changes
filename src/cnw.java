public class cnw extends cnu {
   private static final bst b = bst.c(0.0F, 0.0F);

   public cnw(bsw<? extends cnw> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnw(dcu $$0, btl $$1) {
      super(bsw.C, $$1, $$0);
   }

   public cnw(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.C, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dQ()
               .a(
                  new li(lm.S, this.p()),
                  this.dv(),
                  this.dx(),
                  this.dB(),
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      $$0.a().a(this.dR().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         if (this.ah.a(8) == 0) {
            int $$1 = 1;
            if (this.ah.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cfh $$3 = bsw.t.a(this.dQ());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
                  if (!$$3.a(b)) {
                     break;
                  }

                  this.dQ().b($$3);
               }
            }
         }

         this.dQ().a(this, (byte)3);
         this.aq();
      }
   }

   @Override
   protected cuj t() {
      return cur.qR;
   }
}
