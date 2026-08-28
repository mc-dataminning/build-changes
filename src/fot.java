public enum fot {
   a,
   b;

   public fot a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fou b() {
      return switch (this) {
         case a -> fou.d;
         case b -> fou.b;
      };
   }

   public fou c() {
      return switch (this) {
         case a -> fou.c;
         case b -> fou.a;
      };
   }

   public fou a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
