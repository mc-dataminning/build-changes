import java.util.Map;

public class cyy extends czh {
   public cyy(cyo $$0) {
      super("", $$0, czi.a(Map.of('#', cyw.a(cut.qO), 'x', cyw.a(cut.rU)), "###", "#x#", "###"), new cuq(cut.uj));
   }

   @Override
   public boolean a(cyp $$0, dcw $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuq $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            eqr $$3 = cvc.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuq a(cyp $$0, jo.a $$1) {
      cuq $$2 = a($$0).c(1);
      $$2.b(kq.D, cxt.b);
      return $$2;
   }

   private static cuq a(cyp $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cuq $$2 = $$0.a($$1);
         if ($$2.a(cut.rU)) {
            return $$2;
         }
      }

      return cuq.l;
   }

   @Override
   public boolean as_() {
      return true;
   }

   @Override
   public cze<?> at_() {
      return cze.f;
   }
}
