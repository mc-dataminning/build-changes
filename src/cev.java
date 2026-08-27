public class cev extends cex {
   public cev(bkz<? extends cev> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cev(csf $$0, bll $$1) {
      super(bkz.aP, $$1, $$0);
   }

   public cev(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected clj s() {
      return clr.qz;
   }

   private ju y() {
      clo $$0 = this.u();
      return (ju)($$0.b() ? jw.R : new js(jw.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         ju $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN().a($$1, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      bkv $$1 = $$0.a();
      int $$2 = $$1 instanceof cax ? 3 : 0;
      $$1.a(this.dO().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, (byte)3);
         this.am();
      }
   }
}
