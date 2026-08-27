public enum fkc {
   a,
   b;

   public fkc a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fkd b() {
      return switch (this) {
         case a -> fkd.d;
         case b -> fkd.b;
      };
   }

   public fkd c() {
      return switch (this) {
         case a -> fkd.c;
         case b -> fkd.a;
      };
   }

   public fkd a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
