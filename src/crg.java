public class crg extends crj {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private static final String[] g = new String[]{"all", "undead", "arthropods"};
   private static final int[] h = new int[]{1, 5, 5};
   private static final int[] i = new int[]{11, 8, 8};
   private static final int[] j = new int[]{20, 20, 20};
   public final int d;

   public crg(crj.a $$0, int $$1, bma... $$2) {
      super($$0, crk.f, $$2);
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
   public float a(int $$0, bmq $$1) {
      if (this.d == 0) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else if (this.d == 1 && $$1 == bmq.b) {
         return (float)$$0 * 2.5F;
      } else {
         return this.d == 2 && $$1 == bmq.c ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(crj $$0) {
      return !($$0 instanceof crg);
   }

   @Override
   public boolean a(cmy $$0) {
      return $$0.d() instanceof ckn ? true : super.a($$0);
   }

   @Override
   public void a(bml $$0, blv $$1, int $$2) {
      if ($$1 instanceof bml $$3 && this.d == 2 && $$2 > 0 && $$3.eS() == bmq.c) {
         int $$4 = 20 + $$0.eg().a(10 * $$2);
         $$3.b(new bli(blk.b, $$4, 3));
      }
   }
}
