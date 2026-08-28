public enum flx {
   a,
   b;

   public flx a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fly b() {
      return switch (this) {
         case a -> fly.d;
         case b -> fly.b;
      };
   }

   public fly c() {
      return switch (this) {
         case a -> fly.c;
         case b -> fly.a;
      };
   }

   public fly a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
