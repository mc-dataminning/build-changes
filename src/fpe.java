public enum fpe {
   a,
   b;

   public fpe a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fpf b() {
      return switch (this) {
         case a -> fpf.d;
         case b -> fpf.b;
      };
   }

   public fpf c() {
      return switch (this) {
         case a -> fpf.c;
         case b -> fpf.a;
      };
   }

   public fpf a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
