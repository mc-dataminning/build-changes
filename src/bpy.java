public enum bpy {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bpy a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bpw b() {
      return switch (this) {
         case a -> bpw.a;
         case b -> bpw.b;
         case c -> bpw.c;
         case d, e -> bpw.d;
         case f -> bpw.e;
      };
   }
}
