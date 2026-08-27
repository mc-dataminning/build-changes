public enum fib {
   a,
   b;

   public fib a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fic b() {
      return switch (this) {
         case a -> fic.d;
         case b -> fic.b;
      };
   }

   public fic c() {
      return switch (this) {
         case a -> fic.c;
         case b -> fic.a;
      };
   }

   public fic a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
