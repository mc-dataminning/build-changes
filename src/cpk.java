import java.util.Map;

public class cpk extends cps {
   public cpk(cpb $$0) {
      super("", $$0, cpt.a(Map.of('#', cpi.a(cmk.qL), 'x', cpi.a(cmk.rR)), "###", "#x#", "###"), new cmh(cmk.uc));
   }

   @Override
   public boolean a(cia $$0, csy $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cmh $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            efj $$3 = cmo.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cmh a(cia $$0, is $$1) {
      cmh $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cmh a(cia $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cmh $$2 = $$0.a($$1);
         if ($$2.a(cmk.rR)) {
            return $$2;
         }
      }

      return cmh.f;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public cpp<?> ar_() {
      return cpp.f;
   }
}
