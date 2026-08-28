public enum flj {
   a,
   b;

   public flj a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public flk b() {
      return switch (this) {
         case a -> flk.d;
         case b -> flk.b;
      };
   }

   public flk c() {
      return switch (this) {
         case a -> flk.c;
         case b -> flk.a;
      };
   }

   public flk a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
