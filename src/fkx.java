public interface fkx extends fin, fla {
   fkx.a t();

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
