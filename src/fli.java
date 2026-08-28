public enum fli {
   a,
   b;

   public fli a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public flj b() {
      return switch (this) {
         case a -> flj.d;
         case b -> flj.b;
      };
   }

   public flj c() {
      return switch (this) {
         case a -> flj.c;
         case b -> flj.a;
      };
   }

   public flj a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
