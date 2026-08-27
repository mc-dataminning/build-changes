import java.util.Map.Entry;

public class cxr extends cwz {
   private static final float b = 0.15F;

   public cxr(cwz.a $$0, bqh... $$1) {
      super($$0, avm.bf, $$1);
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
   public void b(bqt $$0, bqa $$1, int $$2) {
      axt $$3 = $$0.ei();
      Entry<bqh, crs> $$4 = cxa.b(cxc.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dN().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$4.getKey());
         }
      }
   }

   public static boolean a(int $$0, axt $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, axt $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
