public class ctl extends csu {
   public ctl(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(csz $$0, clh $$1, bsa $$2, bpl $$3) {
      wu $$4 = $$0.a(ka.f);
      if ($$4 != null && !($$2 instanceof clh)) {
         if (!$$1.dN().B && $$2.bB()) {
            $$2.b($$4);
            if ($$2 instanceof bsc $$5) {
               $$5.fT();
            }

            $$0.h(1);
         }

         return bpm.a($$1.dN().B);
      } else {
         return bpm.d;
      }
   }
}
