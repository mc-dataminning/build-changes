import java.util.Map.Entry;

public class cpl extends cot {
   private static final float a = 0.15F;

   public cpl(cot.a $$0, bjy... $$1) {
      super($$0, cou.d, $$1);
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
   public boolean a(ckj $$0) {
      return $$0.d() instanceof cht ? true : super.a($$0);
   }

   @Override
   public void b(bkj $$0, bjt $$1, int $$2) {
      ate $$3 = $$0.ef();
      Entry<bjy, ckj> $$4 = cov.b(cox.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dM().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$1x -> $$1x.d($$4.getKey()));
         }
      }
   }

   public static boolean a(int $$0, ate $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, ate $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
