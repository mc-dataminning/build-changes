import java.util.Map.Entry;

public class csj extends crr {
   private static final float a = 0.15F;

   public csj(crr.a $$0, bmd... $$1) {
      super($$0, crs.d, $$1);
   }

   @Override
   public int a(int $$0) {
      return 10 + 20 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cng $$0) {
      return $$0.d() instanceof ckr ? true : super.a($$0);
   }

   @Override
   public void b(bmo $$0, blw $$1, int $$2) {
      auw $$3 = $$0.eg();
      Entry<bmd, cng> $$4 = crt.b(crv.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dM().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$1x -> $$1x.d($$4.getKey()));
         }
      }
   }

   public static boolean a(int $$0, auw $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, auw $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
