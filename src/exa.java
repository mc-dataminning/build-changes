public interface exa extends eut, exd {
   exa.a q();

   default boolean aJ_() {
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
