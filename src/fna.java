public enum fna {
   a,
   b,
   c,
   d;

   public boolean a() {
      return this == b;
   }

   public boolean b() {
      return this == c || this == d;
   }
}
