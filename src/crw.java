public class crw extends crj {
   public crw(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      if ($$0.B) {
         return bpn.a($$3);
      } else {
         $$3.a(1, $$1);
         $$1.b(avm.c.b(this));
         $$1.dN().a(null, $$1, avc.Ag, $$1.dc(), 1.0F, 1.0F);
         csz $$4 = cth.a($$0, $$1.dr(), $$1.dx(), (byte)0, true, false);
         if ($$3.d()) {
            return bpn.b($$4);
         } else {
            if (!$$1.ga().f($$4.r())) {
               $$1.a($$4, false);
            }

            return bpn.b($$3);
         }
      }
   }
}
