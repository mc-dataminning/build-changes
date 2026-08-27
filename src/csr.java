import java.util.Map;

public class csr extends csz {
   public csr(csi $$0) {
      super("", $$0, cta.a(Map.of('#', csp.a(cpt.qN), 'x', csp.a(cpt.rT)), "###", "#x#", "###"), new cpq(cpt.uf));
   }

   @Override
   public boolean a(clk $$0, cwe $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cpq $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ejc $$3 = cpx.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = a($$0).c(1);
      $$2.x().a("map_scale_direction", 1);
      return $$2;
   }

   private static cpq a(clk $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cpq $$2 = $$0.a($$1);
         if ($$2.a(cpt.rT)) {
            return $$2;
         }
      }

      return cpq.h;
   }

   @Override
   public boolean ar_() {
      return true;
   }

   @Override
   public csw<?> as_() {
      return csw.f;
   }
}
