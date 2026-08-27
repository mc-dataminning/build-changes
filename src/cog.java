import java.util.Map.Entry;

public class cog extends cno {
   private static final float a = 0.15F;

   public cog(cno.a $$0, biv... $$1) {
      super($$0, cnp.d, $$1);
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
   public boolean a(cjf $$0) {
      return $$0.d() instanceof cgp ? true : super.a($$0);
   }

   @Override
   public void b(bjg $$0, biq $$1, int $$2) {
      asc $$3 = $$0.ef();
      Entry<biv, cjf> $$4 = cnq.b(cns.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a($$0.dM().d($$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            $$4.getValue().a(2, $$0, $$1x -> $$1x.d($$4.getKey()));
         }
      }
   }

   public static boolean a(int $$0, asc $$1) {
      return $$0 <= 0 ? false : $$1.i() < 0.15F * (float)$$0;
   }

   public static int b(int $$0, asc $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
