import java.util.Map;

public class cxt extends cyb {
   public cxt(cxk $$0) {
      super("", $$0, cyc.a(Map.of('#', cxr.a(ctr.qO), 'x', cxr.a(ctr.rU)), "###", "#x#", "###"), new cto(ctr.uj));
   }

   @Override
   public boolean a(cpj $$0, dax $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cto $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            eoj $$3 = ctw.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cto a(cpj $$0, iz.a $$1) {
      cto $$2 = a($$0).c(1);
      $$2.b(kb.C, cwp.b);
      return $$2;
   }

   private static cto a(cpj $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cto $$2 = $$0.a($$1);
         if ($$2.a(ctr.rU)) {
            return $$2;
         }
      }

      return cto.i;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.f;
   }
}
