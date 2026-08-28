public enum fmj {
   a,
   b;

   public fmj a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fmk b() {
      return switch (this) {
         case a -> fmk.d;
         case b -> fmk.b;
      };
   }

   public fmk c() {
      return switch (this) {
         case a -> fmk.c;
         case b -> fmk.a;
      };
   }

   public fmk a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
