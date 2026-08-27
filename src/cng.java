public class cng extends cnj {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private static final String[] g = new String[]{"all", "undead", "arthropods"};
   private static final int[] h = new int[]{1, 5, 5};
   private static final int[] i = new int[]{11, 8, 8};
   private static final int[] j = new int[]{20, 20, 20};
   public final int d;

   public cng(cnj.a $$0, int $$1, biq... $$2) {
      super($$0, cnk.f, $$2);
      this.d = $$1;
   }

   @Override
   public int a(int $$0) {
      return h[this.d] + ($$0 - 1) * i[this.d];
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + j[this.d];
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public float a(int $$0, bjg $$1) {
      if (this.d == 0) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else if (this.d == 1 && $$1 == bjg.b) {
         return (float)$$0 * 2.5F;
      } else {
         return this.d == 2 && $$1 == bjg.c ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(cnj $$0) {
      return !($$0 instanceof cng);
   }

   @Override
   public boolean a(cja $$0) {
      return $$0.d() instanceof cgp ? true : super.a($$0);
   }

   @Override
   public void a(bjb $$0, bil $$1, int $$2) {
      if ($$1 instanceof bjb $$3 && this.d == 2 && $$2 > 0 && $$3.eQ() == bjg.c) {
         int $$4 = 20 + $$0.ee().a(10 * $$2);
         $$3.b(new bhy(bia.b, $$4, 3));
      }
   }
}
