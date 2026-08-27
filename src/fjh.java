public enum fjh {
   a,
   b;

   public fjh a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fji b() {
      return switch (this) {
         case a -> fji.d;
         case b -> fji.b;
      };
   }

   public fji c() {
      return switch (this) {
         case a -> fji.c;
         case b -> fji.a;
      };
   }

   public fji a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
