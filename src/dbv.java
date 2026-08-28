public record dbv(cwn a) implements dbi {
   @Override
   public cwn a(int $$0) {
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

   public cwn c() {
      return this.a;
   }
}
