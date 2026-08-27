import java.util.Map;

public class cvr extends cvz {
   public cvr(cvi $$0) {
      super("", $$0, cwa.a(Map.of('#', cvp.a(crv.qN), 'x', cvp.a(crv.rT)), "###", "#x#", "###"), new crs(crv.uh));
   }

   @Override
   public boolean a(cnm $$0, czg $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         crs $$2 = a($$0);
         if ($$2.d()) {
            return false;
         } else {
            emo $$3 = crz.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public crs a(cnm $$0, jb $$1) {
      crs $$2 = a($$0).c(1);
      $$2.b(jr.u, cuo.b);
      return $$2;
   }

   private static crs a(cnm $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         crs $$2 = $$0.a($$1);
         if ($$2.a(crv.rT)) {
            return $$2;
         }
      }

      return crs.i;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.f;
   }
}
