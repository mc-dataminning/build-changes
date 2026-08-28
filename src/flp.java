public enum flp {
   a,
   b;

   public flp a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public flq b() {
      return switch (this) {
         case a -> flq.d;
         case b -> flq.b;
      };
   }

   public flq c() {
      return switch (this) {
         case a -> flq.c;
         case b -> flq.a;
      };
   }

   public flq a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
