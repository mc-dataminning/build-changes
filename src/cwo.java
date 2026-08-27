import java.util.Optional;

public interface cwo extends cpt, cub {
   @Override
   default boolean a(cls $$0, gu $$1, dcb $$2, dxd $$3) {
      return $$3 == dxf.c;
   }

   @Override
   default boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
      if (!$$2.c(dcr.C) && $$3.a() == dxf.c) {
         if (!$$0.r_()) {
            $$0.a($$1, $$2.a(dcr.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cfz c(cmn $$0, gu $$1, dcb $$2) {
      if ($$2.c(dcr.C)) {
         $$0.a($$1, $$2.a(dcr.C, Boolean.valueOf(false)), 3);
         if (!$$2.a($$0, $$1)) {
            $$0.b($$1, true);
         }

         return new cfz(cgc.pL);
      } else {
         return cfz.b;
      }
   }

   @Override
   default Optional<amg> am_() {
      return dxf.c.j();
   }
}
