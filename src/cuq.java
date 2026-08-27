import java.util.Map.Entry;

public class cuq extends ctz {
   private static final float b = 0.15F;

   public cuq(ctz.a $$0, bom... $$1) {
      super($$0, aum.bf, $$1);
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
   public void b(box $$0, bof $$1, int $$2) {
      awt $$3 = $$0.ef();
      Entry<bom, cpq> $$4 = cua.b(cuc.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dK().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$4.getKey());
         }
      }
   }

   public static boolean a(int $$0, awt $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, awt $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
