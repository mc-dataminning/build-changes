public enum bqf {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqf a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqd b() {
      return switch (this) {
         case a -> bqd.a;
         case b -> bqd.c;
         case c -> bqd.d;
         case d, e -> bqd.e;
         case f -> bqd.f;
      };
   }
}
