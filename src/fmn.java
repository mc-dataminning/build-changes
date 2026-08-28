public enum fmn {
   a,
   b;

   public fmn a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fmo b() {
      return switch (this) {
         case a -> fmo.d;
         case b -> fmo.b;
      };
   }

   public fmo c() {
      return switch (this) {
         case a -> fmo.c;
         case b -> fmo.a;
      };
   }

   public fmo a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
