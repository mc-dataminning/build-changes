import java.util.Map;

public class cxc extends cxk {
   public cxc(cwt $$0) {
      super("", $$0, cxl.a(Map.of('#', cxa.a(ctc.qO), 'x', cxa.a(ctc.rU)), "###", "#x#", "###"), new csz(ctc.uj));
   }

   @Override
   public boolean a(cou $$0, dad $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         csz $$2 = a($$0);
         if ($$2.d()) {
            return false;
         } else {
            enp $$3 = cth.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public csz a(cou $$0, iy.a $$1) {
      csz $$2 = a($$0).c(1);
      $$2.b(ka.B, cvy.b);
      return $$2;
   }

   private static csz a(cou $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         csz $$2 = $$0.a($$1);
         if ($$2.a(ctc.rU)) {
            return $$2;
         }
      }

      return csz.i;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.f;
   }
}
