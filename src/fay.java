public enum fay {
   a,
   b;

   public fay a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public faz b() {
      return switch (this) {
         case a -> faz.d;
         case b -> faz.b;
      };
   }

   public faz c() {
      return switch (this) {
         case a -> faz.c;
         case b -> faz.a;
      };
   }

   public faz a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
