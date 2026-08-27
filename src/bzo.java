public class bzo extends bzm {
   public bzo(bfn<? extends bzo> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzo(cmm $$0, bfz $$1) {
      super(bfn.z, $$1, $$0);
   }

   public bzo(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.z, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dI()
               .a(
                  new ir(iv.O, this.j()),
                  this.dn(),
                  this.dp(),
                  this.dt(),
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      $$0.a().a(this.dJ().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      if (!this.dI().B) {
         if (this.af.a(8) == 0) {
            int $$1 = 1;
            if (this.af.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               brq $$3 = bfn.q.a(this.dI());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dn(), this.dp(), this.dt(), this.dy(), 0.0F);
                  this.dI().b($$3);
               }
            }
         }

         this.dI().a(this, (byte)3);
         this.ai();
      }
   }

   @Override
   protected cfu k() {
      return cgc.qd;
   }
}
