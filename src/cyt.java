import java.util.Map;

public class cyt extends czb {
   public cyt(cyk $$0) {
      super("", $$0, czc.a(Map.of('#', cyr.a(cur.qO), 'x', cyr.a(cur.rU)), "###", "#x#", "###"), new cuo(cur.uj));
   }

   @Override
   public boolean a(cqj $$0, dbx $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuo $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epj $$3 = cuw.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuo a(cqj $$0, jk.a $$1) {
      cuo $$2 = a($$0).c(1);
      $$2.b(km.D, cxp.b);
      return $$2;
   }

   private static cuo a(cqj $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cuo $$2 = $$0.a($$1);
         if ($$2.a(cur.rU)) {
            return $$2;
         }
      }

      return cuo.l;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.f;
   }
}
