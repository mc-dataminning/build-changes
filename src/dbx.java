public record dbx(cwp a) implements dbk {
   @Override
   public cwp a(int $$0) {
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

   public cwp c() {
      return this.a;
   }
}
