public enum ewp {
   a,
   b;

   public ewp a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ewq b() {
      return switch (this) {
         case a -> ewq.d;
         case b -> ewq.b;
      };
   }

   public ewq c() {
      return switch (this) {
         case a -> ewq.c;
         case b -> ewq.a;
      };
   }

   public ewq a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
