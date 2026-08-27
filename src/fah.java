public enum fah {
   a,
   b;

   public fah a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fai b() {
      return switch (this) {
         case a -> fai.d;
         case b -> fai.b;
      };
   }

   public fai c() {
      return switch (this) {
         case a -> fai.c;
         case b -> fai.a;
      };
   }

   public fai a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
