import java.util.Map.Entry;

public class cvl extends cuu {
   private static final float b = 0.15F;

   public cvl(cuu.a $$0, bpd... $$1) {
      super($$0, auv.bf, $$1);
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
   public void b(bpo $$0, bow $$1, int $$2) {
      axd $$3 = $$0.ei();
      Entry<bpd, cqk> $$4 = cuv.b(cux.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dN().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$4.getKey());
         }
      }
   }

   public static boolean a(int $$0, axd $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, axd $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
