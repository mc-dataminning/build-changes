public enum flh {
   a,
   b;

   public flh a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fli b() {
      return switch (this) {
         case a -> fli.d;
         case b -> fli.b;
      };
   }

   public fli c() {
      return switch (this) {
         case a -> fli.c;
         case b -> fli.a;
      };
   }

   public fli a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
