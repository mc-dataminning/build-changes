public enum foe {
   a,
   b;

   public foe a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fof b() {
      return switch (this) {
         case a -> fof.d;
         case b -> fof.b;
      };
   }

   public fof c() {
      return switch (this) {
         case a -> fof.c;
         case b -> fof.a;
      };
   }

   public fof a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
