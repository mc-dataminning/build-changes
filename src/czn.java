import java.util.Map.Entry;

public class czn extends czb {
   private static final float b = 0.15F;

   public czn(czb.b $$0) {
      super($$0);
   }

   @Override
   public void b(bsq $$0, brw $$1, int $$2) {
      aym $$3 = $$0.el();
      Entry<bsd, ctq> $$4 = czc.b(cze.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dQ().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$4.getKey());
         }
      }
   }

   public static boolean a(int $$0, aym $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, aym $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
