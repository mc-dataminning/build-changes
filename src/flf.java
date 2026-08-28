public enum flf {
   a,
   b;

   public flf a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public flg b() {
      return switch (this) {
         case a -> flg.d;
         case b -> flg.b;
      };
   }

   public flg c() {
      return switch (this) {
         case a -> flg.c;
         case b -> flg.a;
      };
   }

   public flg a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
