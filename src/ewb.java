public interface ewb extends etu, ewe {
   ewb.a q();

   default boolean az_() {
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
