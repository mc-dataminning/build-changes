public enum aii {
   a,
   b,
   c;

   private static final int d = 1;
   private static final int e = 2;
   private static final int f = 3;

   public static aii a(int $$0) {
      return switch ($$0) {
         case 1 -> a;
         case 2 -> b;
         case 3 -> c;
         default -> throw new IllegalArgumentException("Unknown connection intent: " + $$0);
      };
   }

   public int a() {
      return switch (this) {
         case a -> 1;
         case b -> 2;
         case c -> 3;
      };
   }
}
