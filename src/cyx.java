import java.util.Map;

public class cyx extends czh {
   public cyx(cyo $$0) {
      super("", $$0, czi.a(Map.of('#', cyv.a(cuk.sl), 'x', cyv.a(cuk.tr)), "###", "#x#", "###"), new cuh(cuk.vU));
   }

   @Override
   public boolean a(cpw $$0, dca $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cuh $$2 = a($$0);
         if ($$2.d()) {
            return false;
         } else {
            eqt $$3 = cuq.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cuh a(cpw $$0, jc.a $$1) {
      cuh $$2 = a($$0).c(1);
      $$2.b(ke.B, cxr.b);
      return $$2;
   }

   private static cuh a(cpw $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cuh $$2 = $$0.a($$1);
         if ($$2.a(cuk.tr)) {
            return $$2;
         }
      }

      return cuh.i;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cze<?> ao_() {
      return cze.g;
   }
}
