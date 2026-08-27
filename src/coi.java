import java.util.Map.Entry;

public class coi extends cnq {
   private static final float a = 0.15F;

   public coi(cnq.a $$0, bix... $$1) {
      super($$0, cnr.d, $$1);
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
   public boolean a(cjh $$0) {
      return $$0.d() instanceof cgr ? true : super.a($$0);
   }

   @Override
   public void b(bji $$0, bis $$1, int $$2) {
      ase $$3 = $$0.ef();
      Entry<bix, cjh> $$4 = cns.b(cnu.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dM().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$1x -> $$1x.d($$4.getKey()));
         }
      }
   }

   public static boolean a(int $$0, ase $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, ase $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
