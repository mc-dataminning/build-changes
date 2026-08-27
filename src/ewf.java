public enum ewf {
   a,
   b;

   public ewf a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public ewg b() {
      return switch (this) {
         case a -> ewg.d;
         case b -> ewg.b;
      };
   }

   public ewg c() {
      return switch (this) {
         case a -> ewg.c;
         case b -> ewg.a;
      };
   }

   public ewg a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
