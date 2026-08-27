public class csa extends csu {
   public csa(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.io, avd.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      $$1.gv().a(this, 20);
      if (!$$0.B) {
         cmj $$4 = new cmj($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dF(), $$1.dD(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avm.c.b(this));
      $$3.a(1, $$1);
      return bpn.a($$3, $$0.x_());
   }
}
