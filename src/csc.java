public class csc extends csu {
   public csc(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.iB, avd.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cmk $$4 = new cmk($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dF(), $$1.dD(), -20.0F, 0.7F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avm.c.b(this));
      $$3.a(1, $$1);
      return bpn.a($$3, $$0.x_());
   }
}
