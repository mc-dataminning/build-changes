import java.util.Map;

public class cys extends cza {
   public cys(cyj $$0) {
      super("", $$0, czb.a(Map.of('#', cyq.a(cuq.qO), 'x', cyq.a(cuq.rU)), "###", "#x#", "###"), new cun(cuq.uj));
   }

   @Override
   public boolean a(cqi $$0, dbw $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cun $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epi $$3 = cuv.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cun a(cqi $$0, jk.a $$1) {
      cun $$2 = a($$0).c(1);
      $$2.b(km.C, cxo.b);
      return $$2;
   }

   private static cun a(cqi $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cun $$2 = $$0.a($$1);
         if ($$2.a(cuq.rU)) {
            return $$2;
         }
      }

      return cun.l;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.f;
   }
}
