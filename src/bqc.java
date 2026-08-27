public enum bqc {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqc a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqa b() {
      return switch (this) {
         case a -> bqa.a;
         case b -> bqa.b;
         case c -> bqa.c;
         case d, e -> bqa.d;
         case f -> bqa.e;
      };
   }
}
