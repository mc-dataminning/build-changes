public enum bqs {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqs a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqq b() {
      return switch (this) {
         case a -> bqq.a;
         case b -> bqq.c;
         case c -> bqq.d;
         case d, e -> bqq.e;
         case f -> bqq.f;
      };
   }
}
