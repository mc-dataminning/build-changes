public enum fhs {
   a,
   b;

   public fhs a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fht b() {
      return switch (this) {
         case a -> fht.d;
         case b -> fht.b;
      };
   }

   public fht c() {
      return switch (this) {
         case a -> fht.c;
         case b -> fht.a;
      };
   }

   public fht a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
