public enum fbr {
   a,
   b;

   public fbr a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fbs b() {
      return switch (this) {
         case a -> fbs.d;
         case b -> fbs.b;
      };
   }

   public fbs c() {
      return switch (this) {
         case a -> fbs.c;
         case b -> fbs.a;
      };
   }

   public fbs a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
