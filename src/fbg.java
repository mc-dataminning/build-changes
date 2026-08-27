public enum fbg {
   a,
   b;

   public fbg a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fbh b() {
      return switch (this) {
         case a -> fbh.d;
         case b -> fbh.b;
      };
   }

   public fbh c() {
      return switch (this) {
         case a -> fbh.c;
         case b -> fbh.a;
      };
   }

   public fbh a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
