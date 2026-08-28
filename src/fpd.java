public interface fpd extends fmr, fpg {
   fpd.a u();

   default boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public boolean a() {
         return this == c;
      }
   }
}
