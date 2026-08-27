public interface fjt extends fhj, fjw {
   fjt.a t();

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
