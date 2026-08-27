public enum adc {
   a,
   b;

   private static final int c = 1;
   private static final int d = 2;

   public static adc a(int $$0) {
      return switch ($$0) {
         case 1 -> a;
         case 2 -> b;
         default -> throw new IllegalArgumentException("Unknown connection intent: " + $$0);
      };
   }

   public int a() {
      return switch (this) {
         case a -> 1;
         case b -> 2;
      };
   }

   public sp b() {
      return switch (this) {
         case a -> sp.c;
         case b -> sp.d;
      };
   }
}
