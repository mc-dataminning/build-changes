import java.util.Map;

public class dbb extends dbr {
   public dbb(daq $$0) {
      super("", $$0, dbs.a(Map.of('#', daz.a(cws.rv), 'x', daz.a(cws.sR)), "###", "#x#", "###"), new cwo(cws.vi));
   }

   @Override
   public boolean a(dar $$0, dgh $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cwo $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eus $$3 = cxb.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cwo a(dar $$0, jt.a $$1) {
      cwo $$2 = c($$0).c(1);
      $$2.b(kv.N, czl.b);
      return $$2;
   }

   private static cwo c(dar $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cwo $$2 = $$0.a($$1);
         if ($$2.b(kv.L)) {
            return $$2;
         }
      }

      return cwo.j;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dbn<dbb> a() {
      return dbn.f;
   }
}
