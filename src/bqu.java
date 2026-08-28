public enum bqu {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this == a || this == c || this == d || this == b;
   }

   public boolean b() {
      return this == a || this == b;
   }

   public boolean c() {
      return this == a || this == c;
   }

   public static bqu a(boolean $$0) {
      return $$0 ? a : c;
   }
}
