import java.util.Map;

public class csa extends csi {
   public csa(crr $$0) {
      super("", $$0, csj.a(Map.of('#', cry.a(cpc.qN), 'x', cry.a(cpc.rT)), "###", "#x#", "###"), new coz(cpc.uf));
   }

   @Override
   public boolean a(ckr $$0, cvn $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         coz $$2 = a($$0);
         if ($$2.b()) {
            return false;
         } else {
            ehz $$3 = cpg.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.f() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public coz a(ckr $$0, iw $$1) {
      coz $$2 = a($$0).c(1);
      $$2.x().a("map_scale_direction", 1);
      return $$2;
   }

   private static coz a(ckr $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         coz $$2 = $$0.a($$1);
         if ($$2.a(cpc.rT)) {
            return $$2;
         }
      }

      return coz.h;
   }

   @Override
   public boolean as_() {
      return true;
   }

   @Override
   public csf<?> at_() {
      return csf.f;
   }
}
