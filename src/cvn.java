public class cvn extends csv implements cvm {
   public cvn(dfi.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      $$1.a($$2, this, this.a());
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, this.a());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.H_()) {
         bym $$4 = bym.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(bym $$0) {
   }

   protected int a() {
      return 2;
   }

   public static boolean h(dfj $$0) {
      return $$0.i() || $$0.a(apt.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            asa.a($$1, $$2, $$3, new ip(ix.z, $$0));
         }
      }
   }

   public int d(dfj $$0, cpb $$1, gw $$2) {
      return -16777216;
   }
}
