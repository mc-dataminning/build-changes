import java.util.Map.Entry;

public class dan extends dab {
   private static final float b = 0.15F;

   public dan(dab.b $$0) {
      super($$0);
   }

   @Override
   public void b(btq $$0, bsv $$1, int $$2) {
      azh $$3 = $$0.el();
      Entry<btc, cuq> $$4 = dac.b(dae.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dQ().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$4.getKey());
         }
      }
   }

   public static boolean a(int $$0, azh $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, azh $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
