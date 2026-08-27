public class cxr extends csv implements csx {
   public cxr(dfi.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      $$0.G_().c(je.as).flatMap($$0x -> $$0x.b(or.n)).ifPresent($$3x -> ((dnj)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
