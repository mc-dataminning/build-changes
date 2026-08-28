public enum fsd {
   a,
   b;

   public fsd a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fse b() {
      return switch (this) {
         case a -> fse.d;
         case b -> fse.b;
      };
   }

   public fse c() {
      return switch (this) {
         case a -> fse.c;
         case b -> fse.a;
      };
   }

   public fse a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
