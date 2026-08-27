import java.util.Map;

public class ctm extends ctu {
   public ctm(ctd $$0) {
      super("", $$0, ctv.a(Map.of('#', ctk.a(cqn.qN), 'x', ctk.a(cqn.rT)), "###", "#x#", "###"), new cqk(cqn.ug));
   }

   @Override
   public boolean a(cme $$0, cwz $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cqk $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ejy $$3 = cqr.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = a($$0).c(1);
      $$2.x().a("map_scale_direction", 1);
      return $$2;
   }

   private static cqk a(cme $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cqk $$2 = $$0.a($$1);
         if ($$2.a(cqn.rT)) {
            return $$2;
         }
      }

      return cqk.h;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.f;
   }
}
