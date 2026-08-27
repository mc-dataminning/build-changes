public enum fix {
   a,
   b;

   public fix a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fiy b() {
      return switch (this) {
         case a -> fiy.d;
         case b -> fiy.b;
      };
   }

   public fiy c() {
      return switch (this) {
         case a -> fiy.c;
         case b -> fiy.a;
      };
   }

   public fiy a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
