public record dec(cys a) implements ddp {
   @Override
   public cys a(int $$0) {
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

   public cys c() {
      return this.a;
   }
}
