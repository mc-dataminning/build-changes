public class csg extends csu {
   public csg(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if ($$1.cu != null) {
         if (!$$0.B) {
            int $$4 = $$1.cu.a($$3);
            $$3.a($$4, $$1, bsa.d($$2));
         }

         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.iR, avd.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dva.C);
      } else {
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.iT, avd.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cyh.e($$3);
            int $$6 = cyh.d($$3);
            $$0.b(new clv($$1, $$0, $$6, $$5));
         }

         $$1.b(avm.c.b(this));
         $$1.a(dva.D);
      }

      return bpn.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
