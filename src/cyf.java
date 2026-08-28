import java.util.Map;

public class cyf extends cyo {
   public cyf(cxv $$0) {
      super("", $$0, cyp.a(Map.of('#', cyd.a(cud.qO), 'x', cyd.a(cud.rU)), "###", "#x#", "###"), new cua(cud.uj));
   }

   @Override
   public boolean a(cxw $$0, dcd $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cua $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epq $$3 = cui.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cua a(cxw $$0, jl.a $$1) {
      cua $$2 = a($$0).c(1);
      $$2.b(kn.D, cxa.b);
      return $$2;
   }

   private static cua a(cxw $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cua $$2 = $$0.a($$1);
         if ($$2.a(cud.rU)) {
            return $$2;
         }
      }

      return cua.l;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.f;
   }
}
