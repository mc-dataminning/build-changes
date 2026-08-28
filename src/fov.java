public interface fov extends fmj, foy {
   fov.a u();

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
