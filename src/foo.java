public enum foo {
   a,
   b;

   public foo a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fop b() {
      return switch (this) {
         case a -> fop.d;
         case b -> fop.b;
      };
   }

   public fop c() {
      return switch (this) {
         case a -> fop.c;
         case b -> fop.a;
      };
   }

   public fop a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
