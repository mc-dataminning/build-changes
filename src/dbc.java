import java.util.Map;

public class dbc extends dbs {
   public dbc(dar $$0) {
      super("", $$0, dbt.a(Map.of('#', dba.a(cwt.rv), 'x', dba.a(cwt.sR)), "###", "#x#", "###"), new cwp(cwt.vi));
   }

   @Override
   public boolean a(das $$0, dgi $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwp $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eut $$3 = cxc.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwp a(das $$0, jt.a $$1) {
      cwp $$2 = c($$0).c(1);
      $$2.b(kv.N, czm.b);
      return $$2;
   }

   private static cwp c(das $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwp $$2 = $$0.a($$1);
         if ($$2.b(kv.L)) {
            return $$2;
         }
      }

      return cwp.j;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dbo<dbc> a() {
      return dbo.f;
   }
}
