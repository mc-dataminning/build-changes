import java.util.Map;

public class ddh extends ddx {
   public ddh(dcw $$0) {
      super("", $$0, ddy.a(Map.of('#', ddf.a(cyw.rz), 'x', ddf.a(cyw.sV)), "###", "#x#", "###"), new cys(cyw.vm));
   }

   @Override
   public boolean a(dcx $$0, dip $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cys $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            exp $$3 = czf.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.e() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cys a(dcx $$0, jg.a $$1) {
      cys $$2 = c($$0).c(1);
      $$2.b(kj.O, dbp.b);
      return $$2;
   }

   private static cys c(dcx $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cys $$2 = $$0.a($$1);
         if ($$2.c(kj.M)) {
            return $$2;
         }
      }

      return cys.k;
   }

   @Override
   public boolean al_() {
      return true;
   }

   @Override
   public ddt<ddh> a() {
      return ddt.f;
   }
}
