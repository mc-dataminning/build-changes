public enum bka {
   a,
   b,
   c,
   d,
   e;

   public boolean a() {
      return this == a || this == b || this == c;
   }

   public boolean b() {
      return this == a;
   }

   public boolean c() {
      return this == a || this == b;
   }

   public static bka a(boolean $$0) {
      return $$0 ? a : b;
   }
}
