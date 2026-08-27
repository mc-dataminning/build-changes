public class cut extends csu {
   private static final int a = 10;

   public cut(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      if (!$$0.x_()) {
         etp $$3 = $$1.bv().e($$1.bL().a(0.8F));
         if (!$$0.a_(in.a($$3)).r()) {
            $$3 = $$1.bv().e($$1.bL().a(0.05F));
         }

         cmr $$4 = new cmr($$1, $$0, $$3.a(), $$3.b(), $$3.c());
         $$4.a($$1, $$1.dF(), $$1.dD(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.Cc, avd.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      csz $$5 = $$1.b($$2);
      $$1.gv().a(this, 10);
      $$1.b(avm.c.b(this));
      $$5.a(1, $$1);
      return bpn.a($$5, $$0.x_());
   }
}
