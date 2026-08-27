public enum fbf {
   a,
   b;

   public fbf a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fbg b() {
      return switch (this) {
         case a -> fbg.d;
         case b -> fbg.b;
      };
   }

   public fbg c() {
      return switch (this) {
         case a -> fbg.c;
         case b -> fbg.a;
      };
   }

   public fbg a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
