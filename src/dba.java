import java.util.Map;

public class dba extends dbq {
   public dba(dap $$0) {
      super("", $$0, dbr.a(Map.of('#', day.a(cwr.rv), 'x', day.a(cwr.sR)), "###", "#x#", "###"), new cwn(cwr.vi));
   }

   @Override
   public boolean a(daq $$0, dgg $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwn $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eur $$3 = cxa.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwn a(daq $$0, jt.a $$1) {
      cwn $$2 = c($$0).c(1);
      $$2.b(kv.N, czk.b);
      return $$2;
   }

   private static cwn c(daq $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwn $$2 = $$0.a($$1);
         if ($$2.b(kv.L)) {
            return $$2;
         }
      }

      return cwn.j;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dbm<dba> a() {
      return dbm.f;
   }
}
