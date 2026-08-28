public interface fsb extends fpq, fse {
   fsb.a u();

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
