public enum fsj {
   a,
   b;

   public fsj a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsk b() {
      return switch (this) {
         case a -> fsk.d;
         case b -> fsk.b;
      };
   }

   public fsk c() {
      return switch (this) {
         case a -> fsk.c;
         case b -> fsk.a;
      };
   }

   public fsk a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
