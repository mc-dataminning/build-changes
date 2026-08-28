import java.util.Map;

public class dbx extends dcm {
   public dbx(dbn $$0) {
      super("", $$0, dcn.a(Map.of('#', dbv.a(cxo.rm), 'x', dbv.a(cxo.sI)), "###", "#x#", "###"), new cxk(cxo.uZ));
   }

   @Override
   public boolean a(dbo $$0, dha $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cxk $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            evj $$3 = cxx.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cxk a(dbo $$0, js.a $$1) {
      cxk $$2 = c($$0).c(1);
      $$2.b(ku.N, dah.b);
      return $$2;
   }

   private static cxk c(dbo $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cxk $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cxk.k;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dci<dbx> a() {
      return dci.f;
   }
}
