public enum fkd {
   a,
   b;

   public fkd a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fke b() {
      return switch (this) {
         case a -> fke.d;
         case b -> fke.b;
      };
   }

   public fke c() {
      return switch (this) {
         case a -> fke.c;
         case b -> fke.a;
      };
   }

   public fke a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
