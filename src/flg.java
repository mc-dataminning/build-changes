public enum flg {
   a,
   b;

   public flg a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public flh b() {
      return switch (this) {
         case a -> flh.d;
         case b -> flh.b;
      };
   }

   public flh c() {
      return switch (this) {
         case a -> flh.c;
         case b -> flh.a;
      };
   }

   public flh a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
