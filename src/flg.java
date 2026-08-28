public interface flg extends fiw, flj {
   flg.a u();

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
