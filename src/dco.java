public record dco(cxh a) implements dcb {
   @Override
   public cxh a(int $$0) {
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

   public cxh c() {
      return this.a;
   }
}
