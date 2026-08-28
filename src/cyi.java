import java.util.Map;

public class cyi extends cyr {
   public cyi(cxy $$0) {
      super("", $$0, cys.a(Map.of('#', cyg.a(cug.qO), 'x', cyg.a(cug.rU)), "###", "#x#", "###"), new cud(cug.uj));
   }

   @Override
   public boolean a(cxz $$0, dcg $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cud $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epy $$3 = cul.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cud a(cxz $$0, jl.a $$1) {
      cud $$2 = a($$0).c(1);
      $$2.b(kn.D, cxd.b);
      return $$2;
   }

   private static cud a(cxz $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cud $$2 = $$0.a($$1);
         if ($$2.a(cug.rU)) {
            return $$2;
         }
      }

      return cud.l;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.f;
   }
}
