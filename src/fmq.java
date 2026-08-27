public enum fmq {
   a,
   b;

   public fmq a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fmr b() {
      return switch (this) {
         case a -> fmr.d;
         case b -> fmr.b;
      };
   }

   public fmr c() {
      return switch (this) {
         case a -> fmr.c;
         case b -> fmr.a;
      };
   }

   public fmr a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
