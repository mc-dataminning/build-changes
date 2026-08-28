import java.util.Map.Entry;

public class dah extends czv {
   private static final float b = 0.15F;

   public dah(czv.b $$0) {
      super($$0);
   }

   @Override
   public void b(btk $$0, bsp $$1, int $$2) {
      azc $$3 = $$0.el();
      Entry<bsw, cuk> $$4 = czw.b(czy.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dQ().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$4.getKey());
         }
      }
   }

   public static boolean a(int $$0, azc $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, azc $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
