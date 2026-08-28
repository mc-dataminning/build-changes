import java.util.Map;

public class dcc extends dcs {
   public dcc(dbr $$0) {
      super("", $$0, dct.a(Map.of('#', dca.a(cxt.rm), 'x', dca.a(cxt.sI)), "###", "#x#", "###"), new cxp(cxt.uZ));
   }

   @Override
   public boolean a(dbs $$0, dhi $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cxp $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            evr $$3 = cyc.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cxp a(dbs $$0, js.a $$1) {
      cxp $$2 = c($$0).c(1);
      $$2.b(ku.N, dam.b);
      return $$2;
   }

   private static cxp c(dbs $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cxp $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cxp.j;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dco<dcc> a() {
      return dco.f;
   }
}
