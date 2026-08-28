import java.util.Map;

public class cyv extends czd {
   public cyv(cym $$0) {
      super("", $$0, cze.a(Map.of('#', cyt.a(cut.qO), 'x', cyt.a(cut.rU)), "###", "#x#", "###"), new cuq(cut.uj));
   }

   @Override
   public boolean a(cql $$0, dbz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuq $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epl $$3 = cuy.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuq a(cql $$0, jk.a $$1) {
      cuq $$2 = a($$0).c(1);
      $$2.b(km.D, cxr.b);
      return $$2;
   }

   private static cuq a(cql $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cuq $$2 = $$0.a($$1);
         if ($$2.a(cut.rU)) {
            return $$2;
         }
      }

      return cuq.l;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cza<?> ao_() {
      return cza.f;
   }
}
