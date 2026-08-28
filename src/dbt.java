import java.util.Map;

public class dbt extends dcj {
   public dbt(dbi $$0) {
      super("", $$0, dck.a(Map.of('#', dbr.a(cxk.rv), 'x', dbr.a(cxk.sR)), "###", "#x#", "###"), new cxg(cxk.vi));
   }

   @Override
   public boolean a(dbj $$0, dgz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cxg $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            evk $$3 = cxt.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cxg a(dbj $$0, js.a $$1) {
      cxg $$2 = c($$0).c(1);
      $$2.b(ku.N, dad.b);
      return $$2;
   }

   private static cxg c(dbj $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cxg $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cxg.j;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dcf<dbt> a() {
      return dcf.f;
   }
}
