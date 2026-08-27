public class cjh extends cjx {
   public cjh(bsb<? extends cjh> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static btu.a gC() {
      return cjx.gD().a(btv.c, 5.0).a(btv.k, 8.0);
   }

   @Override
   protected void y() {
      this.cc.a(1, new cbe<>(this, cjx.class, true, $$0 -> !($$0 instanceof cjh)));
      this.cc.a(2, new cbe<>(this, cly.class, true, $$0 -> !this.g((cly)$$0)));
      this.cc.a(2, new cbd(this));
      this.t();
   }

   @Override
   protected void t() {
      this.cb.a(2, new cba<>(this, 1.0, false));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(6, new bzx(this, 1.0, true, 4, this::gI));
      this.cb.a(7, new cay(this, 1.0));
   }

   private boolean g(cly $$0) {
      cuh $$1 = $$0.gl().i.get(3);
      return $$1.a(dfe.eV.q());
   }

   @Override
   public boolean a(aqt $$0, bso $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$1 instanceof cjx $$3) {
         cjh $$4 = $$3.a(bsb.bz, false);
         if ($$4 != null) {
            $$4.a($$0, $$0.d_($$4.du()), bss.i, new cjx.b(false, true));
            if (!this.ba()) {
               $$0.a(null, 1051, this.du(), 0);
            }

            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public boolean dV() {
      return true;
   }

   @Override
   protected avn u() {
      return avo.DZ;
   }

   @Override
   protected avn n_() {
      return avo.Eb;
   }

   @Override
   protected avn gy() {
      return avo.Ee;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.Ec;
   }

   @Override
   protected boolean gA() {
      return false;
   }
}
