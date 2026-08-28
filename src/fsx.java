public enum fsx {
   a,
   b;

   public fsx a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsy b() {
      return switch (this) {
         case a -> fsy.d;
         case b -> fsy.b;
      };
   }

   public fsy c() {
      return switch (this) {
         case a -> fsy.c;
         case b -> fsy.a;
      };
   }

   public fsy a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
