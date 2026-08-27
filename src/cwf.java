import java.util.Map;

public class cwf extends cwn {
   public cwf(cvw $$0) {
      super("", $$0, cwo.a(Map.of('#', cwd.a(csg.qO), 'x', cwd.a(csg.rU)), "###", "#x#", "###"), new csd(csg.uj));
   }

   @Override
   public boolean a(cnx $$0, czu $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         csd $$2 = a($$0);
         if ($$2.d()) {
            return false;
         } else {
            ene $$3 = csl.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public csd a(cnx $$0, jj $$1) {
      csd $$2 = a($$0).c(1);
      $$2.b(jz.u, cvc.b);
      return $$2;
   }

   private static csd a(cnx $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         csd $$2 = $$0.a($$1);
         if ($$2.a(csg.rU)) {
            return $$2;
         }
      }

      return csd.i;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.f;
   }
}
