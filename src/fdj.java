public enum fdj {
   a,
   b;

   public fdj a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fdk b() {
      return switch (this) {
         case a -> fdk.d;
         case b -> fdk.b;
      };
   }

   public fdk c() {
      return switch (this) {
         case a -> fdk.c;
         case b -> fdk.a;
      };
   }

   public fdk a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
