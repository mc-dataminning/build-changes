public enum fbe {
   a,
   b;

   public fbe a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fbf b() {
      return switch (this) {
         case a -> fbf.d;
         case b -> fbf.b;
      };
   }

   public fbf c() {
      return switch (this) {
         case a -> fbf.c;
         case b -> fbf.a;
      };
   }

   public fbf a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
