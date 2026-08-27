import java.util.Map.Entry;

public class cnv extends cnd {
   private static final float a = 0.15F;

   public cnv(cnd.a $$0, bil... $$1) {
      super($$0, cne.d, $$1);
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
   public boolean a(ciw $$0) {
      return $$0.d() instanceof cgg ? true : super.a($$0);
   }

   @Override
   public void b(biw $$0, big $$1, int $$2) {
      art $$3 = $$0.ee();
      Entry<bil, ciw> $$4 = cnf.b(cnh.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dL().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$1x -> $$1x.d($$4.getKey()));
         }
      }
   }

   public static boolean a(int $$0, art $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, art $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
