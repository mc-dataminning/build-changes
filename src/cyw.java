import java.util.Map;

public class cyw extends czf {
   public cyw(cym $$0) {
      super("", $$0, czg.a(Map.of('#', cyu.a(cur.qO), 'x', cyu.a(cur.rU)), "###", "#x#", "###"), new cuo(cur.uj));
   }

   @Override
   public boolean a(cyn $$0, dcu $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuo $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            eqn $$3 = cva.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuo a(cyn $$0, jo.a $$1) {
      cuo $$2 = a($$0).c(1);
      $$2.b(kq.D, cxr.b);
      return $$2;
   }

   private static cuo a(cyn $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cuo $$2 = $$0.a($$1);
         if ($$2.a(cur.rU)) {
            return $$2;
         }
      }

      return cuo.l;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public czc<?> ap_() {
      return czc.f;
   }
}
