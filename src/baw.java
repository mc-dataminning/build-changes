public enum baw {
   a,
   b,
   c;

   public boolean a(boolean $$0) {
      return switch (this) {
         case a -> true;
         case b -> false;
         default -> $$0;
      };
   }
}
