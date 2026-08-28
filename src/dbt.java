import java.util.Map;

public class dbt extends dcj {
   public dbt(dbi $$0) {
      super("", $$0, dck.a(Map.of('#', dbr.a(cxl.rx), 'x', dbr.a(cxl.sT)), "###", "#x#", "###"), new cxh(cxl.vk));
   }

   @Override
   public boolean a(dbj $$0, dgz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cxh $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            evq $$3 = cxu.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.e() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cxh a(dbj $$0, jt.a $$1) {
      cxh $$2 = c($$0).c(1);
      $$2.b(kv.O, dac.b);
      return $$2;
   }

   private static cxh c(dbj $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cxh $$2 = $$0.a($$1);
         if ($$2.b(kv.M)) {
            return $$2;
         }
      }

      return cxh.k;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dcf<dbt> a() {
      return dcf.f;
   }
}
