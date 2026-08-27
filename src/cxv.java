import java.util.Map;

public class cxv extends cyd {
   public cxv(cxm $$0) {
      super("", $$0, cye.a(Map.of('#', cxt.a(ctt.qO), 'x', cxt.a(ctt.rU)), "###", "#x#", "###"), new ctq(ctt.uj));
   }

   @Override
   public boolean a(cpl $$0, daz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         ctq $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            eol $$3 = cty.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public ctq a(cpl $$0, iz.a $$1) {
      ctq $$2 = a($$0).c(1);
      $$2.b(kb.C, cwr.b);
      return $$2;
   }

   private static ctq a(cpl $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         ctq $$2 = $$0.a($$1);
         if ($$2.a(ctt.rU)) {
            return $$2;
         }
      }

      return ctq.i;
   }

   @Override
   public boolean ao_() {
      return true;
   }

   @Override
   public cya<?> ap_() {
      return cya.f;
   }
}
