import java.util.Map;

public class dec extends des {
   public dec(ddr $$0) {
      super("", $$0, det.a(Map.of('#', dea.a(czr.rE), 'x', dea.a(czr.tc)), "###", "#x#", "###"), new czn(czr.vt));
   }

   @Override
   public boolean a(dds $$0, djm $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         czn $$2 = c($$0);
         if ($$2.f()) {
            return false;
         } else {
            eyv $$3 = daa.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.d() ? false : $$3.g < 4;
            }
         }
      }
   }

   @Override
   public czn a(dds $$0, jh.a $$1) {
      czn $$2 = c($$0).c(1);
      $$2.b(kk.O, dck.b);
      return $$2;
   }

   private static czn c(dds $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         czn $$2 = $$0.a($$1);
         if ($$2.c(kk.M)) {
            return $$2;
         }
      }

      return czn.k;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public deo<dec> a() {
      return deo.f;
   }
}
