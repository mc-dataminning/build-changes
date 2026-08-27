public class cvp extends csx implements cvo {
   public cvp(dfk.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      $$1.a($$2, this, this.a());
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, this.a());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.H_()) {
         byo $$4 = byo.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(byo $$0) {
   }

   protected int a() {
      return 2;
   }

   public static boolean h(dfl $$0) {
      return $$0.i() || $$0.a(apu.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            asb.a($$1, $$2, $$3, new ip(ix.z, $$0));
         }
      }
   }

   public int d(dfl $$0, cpd $$1, gw $$2) {
      return -16777216;
   }
}
