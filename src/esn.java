public interface esn extends eqn, esq {
   esn.a q();

   default boolean aD_() {
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
