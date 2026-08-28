public record dax(cvp a) implements dak {
   @Override
   public cvp a(int $$0) {
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

   public cvp c() {
      return this.a;
   }
}
