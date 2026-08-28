import java.util.Map;

public class dbd extends dbt {
   public dbd(das $$0) {
      super("", $$0, dbu.a(Map.of('#', dbb.a(cwu.rv), 'x', dbb.a(cwu.sR)), "###", "#x#", "###"), new cwq(cwu.vi));
   }

   @Override
   public boolean a(dat $$0, dgj $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwq $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            euu $$3 = cxd.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwq a(dat $$0, jt.a $$1) {
      cwq $$2 = c($$0).c(1);
      $$2.b(kv.N, czn.b);
      return $$2;
   }

   private static cwq c(dat $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwq $$2 = $$0.a($$1);
         if ($$2.b(kv.L)) {
            return $$2;
         }
      }

      return cwq.j;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dbp<dbd> a() {
      return dbp.f;
   }
}
