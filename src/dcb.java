import java.util.Map;

public class dcb extends dcr {
   public dcb(dbq $$0) {
      super("", $$0, dcs.a(Map.of('#', dbz.a(cxs.rm), 'x', dbz.a(cxs.sI)), "###", "#x#", "###"), new cxo(cxs.uZ));
   }

   @Override
   public boolean a(dbr $$0, dhh $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cxo $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            evq $$3 = cyb.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cxo a(dbr $$0, js.a $$1) {
      cxo $$2 = c($$0).c(1);
      $$2.b(ku.N, dal.b);
      return $$2;
   }

   private static cxo c(dbr $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cxo $$2 = $$0.a($$1);
         if ($$2.b(ku.L)) {
            return $$2;
         }
      }

      return cxo.k;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dcn<dcb> a() {
      return dcn.f;
   }
}
