public enum flv {
   a,
   b;

   public flv a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public flw b() {
      return switch (this) {
         case a -> flw.d;
         case b -> flw.b;
      };
   }

   public flw c() {
      return switch (this) {
         case a -> flw.c;
         case b -> flw.a;
      };
   }

   public flw a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
