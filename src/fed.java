public interface fed extends fbu, feg {
   fed.a s();

   default boolean A() {
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
