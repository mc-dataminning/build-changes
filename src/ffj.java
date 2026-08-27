public enum ffj {
   a,
   b;

   public ffj a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ffk b() {
      return switch (this) {
         case a -> ffk.d;
         case b -> ffk.b;
      };
   }

   public ffk c() {
      return switch (this) {
         case a -> ffk.c;
         case b -> ffk.a;
      };
   }

   public ffk a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
