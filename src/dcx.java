public record dcx(cxp a) implements dck {
   @Override
   public cxp a(int $$0) {
      if ($$0 != 0) {
         throw new IllegalArgumentException("No item for index " + $$0);
      } else {
         return this.a;
      }
   }

   @Override
   public int a() {
      return 1;
   }

   public cxp c() {
      return this.a;
   }
}
