public enum fpm {
   a,
   b;

   public fpm a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fpn b() {
      return switch (this) {
         case a -> fpn.d;
         case b -> fpn.b;
      };
   }

   public fpn c() {
      return switch (this) {
         case a -> fpn.c;
         case b -> fpn.a;
      };
   }

   public fpn a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
