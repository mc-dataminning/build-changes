public enum eyz {
   a,
   b;

   public eyz a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public eza b() {
      return switch (this) {
         case a -> eza.d;
         case b -> eza.b;
      };
   }

   public eza c() {
      return switch (this) {
         case a -> eza.c;
         case b -> eza.a;
      };
   }

   public eza a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
