public interface ffa extends fcq, ffd {
   ffa.a s();

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
