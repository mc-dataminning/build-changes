public enum exj {
   a,
   b;

   public exj a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public exk b() {
      return switch (this) {
         case a -> exk.d;
         case b -> exk.b;
      };
   }

   public exk c() {
      return switch (this) {
         case a -> exk.c;
         case b -> exk.a;
      };
   }

   public exk a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
