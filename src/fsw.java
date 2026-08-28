public enum fsw {
   a,
   b;

   public fsw a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsx b() {
      return switch (this) {
         case a -> fsx.d;
         case b -> fsx.b;
      };
   }

   public fsx c() {
      return switch (this) {
         case a -> fsx.c;
         case b -> fsx.a;
      };
   }

   public fsx a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
