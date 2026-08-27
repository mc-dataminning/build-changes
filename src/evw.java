public interface evw extends etp, evz {
   evw.a q();

   default boolean ax_() {
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
