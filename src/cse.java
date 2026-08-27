import java.util.Map;

public class cse extends csm {
   public cse(crv $$0) {
      super("", $$0, csn.a(Map.of('#', csc.a(cpg.qN), 'x', csc.a(cpg.rT)), "###", "#x#", "###"), new cpd(cpg.uf));
   }

   @Override
   public boolean a(ckv $$0, cvr $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cpd $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            eig $$3 = cpk.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cpd a(ckv $$0, iw $$1) {
      cpd $$2 = a($$0).c(1);
      $$2.x().a("map_scale_direction", 1);
      return $$2;
   }

   private static cpd a(ckv $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cpd $$2 = $$0.a($$1);
         if ($$2.a(cpg.rT)) {
            return $$2;
         }
      }

      return cpd.h;
   }

   @Override
   public boolean as_() {
      return true;
   }

   @Override
   public csj<?> at_() {
      return csj.f;
   }
}
