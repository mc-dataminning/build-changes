public interface fla extends fiq, fld {
   fla.a t();

   default boolean B() {
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
