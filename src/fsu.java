public enum fsu {
   a,
   b;

   public fsu a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsv b() {
      return switch (this) {
         case a -> fsv.d;
         case b -> fsv.b;
      };
   }

   public fsv c() {
      return switch (this) {
         case a -> fsv.c;
         case b -> fsv.a;
      };
   }

   public fsv a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
