import java.util.Map;

public class cqa extends cqi {
   public cqa(cpr $$0) {
      super("", $$0, cqj.a(Map.of('#', cpy.a(cna.qL), 'x', cpy.a(cna.rR)), "###", "#x#", "###"), new cmx(cna.uc));
   }

   @Override
   public boolean a(ciq $$0, cto $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cmx $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ega $$3 = cne.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cmx a(ciq $$0, iu $$1) {
      cmx $$2 = a($$0).c(1);
      $$2.w().a("map_scale_direction", 1);
      return $$2;
   }

   private static cmx a(ciq $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cmx $$2 = $$0.a($$1);
         if ($$2.a(cna.rR)) {
            return $$2;
         }
      }

      return cmx.f;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.f;
   }
}
