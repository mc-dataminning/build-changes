public interface flm extends fjc, flp {
   flm.a u();

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
