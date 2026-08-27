import java.util.Map;

public class cqj extends cqr {
   public cqj(cqa $$0) {
      super("", $$0, cqs.a(Map.of('#', cqh.a(cnj.qN), 'x', cqh.a(cnj.rT)), "###", "#x#", "###"), new cng(cnj.uf));
   }

   @Override
   public boolean a(ciz $$0, ctx $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cng $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            egj $$3 = cnn.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cng a(ciz $$0, iu $$1) {
      cng $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cng a(ciz $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cng $$2 = $$0.a($$1);
         if ($$2.a(cnj.rT)) {
            return $$2;
         }
      }

      return cng.f;
   }

   @Override
   public boolean as_() {
      return true;
   }

   @Override
   public cqo<?> at_() {
      return cqo.f;
   }
}
