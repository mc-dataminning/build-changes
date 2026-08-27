public enum bpo {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bpo a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bpm b() {
      return switch (this) {
         case a -> bpm.a;
         case b -> bpm.b;
         case c -> bpm.c;
         case d, e -> bpm.d;
         case f -> bpm.e;
      };
   }
}
