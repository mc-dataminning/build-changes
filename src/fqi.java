public enum fqi {
   a,
   b;

   public fqi a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fqj b() {
      return switch (this) {
         case a -> fqj.d;
         case b -> fqj.b;
      };
   }

   public fqj c() {
      return switch (this) {
         case a -> fqj.c;
         case b -> fqj.a;
      };
   }

   public fqj a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
