public interface ffc extends fcs, fff {
   ffc.a s();

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
