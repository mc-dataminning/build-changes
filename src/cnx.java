public class cnx extends cnd {
   public cnx(cnd.a $$0, bil... $$1) {
      super($$0, cne.i, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + ($$0 - 1) * 8;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 20;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public float a(int $$0, bjb $$1) {
      return $$1 == bjb.e ? (float)$$0 * 2.5F : 0.0F;
   }
}
