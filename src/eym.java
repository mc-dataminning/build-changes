public enum eym {
   a,
   b;

   public eym a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public eyn b() {
      return switch (this) {
         case a -> eyn.d;
         case b -> eyn.b;
      };
   }

   public eyn c() {
      return switch (this) {
         case a -> eyn.c;
         case b -> eyn.a;
      };
   }

   public eyn a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
