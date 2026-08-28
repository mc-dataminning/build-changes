import java.util.Map;

public class dez extends dfp {
   public dez(deo $$0) {
      super("", $$0, dfq.a(Map.of('#', dex.a(dao.rE), 'x', dex.a(dao.tc)), "###", "#x#", "###"), new dak(dao.vt));
   }

   @Override
   public boolean a(dep $$0, dkj $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         dak $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            ezv $$3 = dax.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public dak a(dep $$0, ji.a $$1) {
      dak $$2 = c($$0).c(1);
      $$2.b(kl.O, ddh.b);
      return $$2;
   }

   private static dak c(dep $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         dak $$2 = $$0.a($$1);
         if ($$2.c(kl.M)) {
            return $$2;
         }
      }

      return dak.l;
   }

   @Override
   public boolean ar_() {
      return true;
   }

   @Override
   public dfl<dez> a() {
      return dfl.f;
   }
}
