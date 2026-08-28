public enum fmp {
   a,
   b;

   public fmp a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fmq b() {
      return switch (this) {
         case a -> fmq.d;
         case b -> fmq.b;
      };
   }

   public fmq c() {
      return switch (this) {
         case a -> fmq.c;
         case b -> fmq.a;
      };
   }

   public fmq a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
