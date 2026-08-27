public enum fem {
   a,
   b;

   public fem a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fen b() {
      return switch (this) {
         case a -> fen.d;
         case b -> fen.b;
      };
   }

   public fen c() {
      return switch (this) {
         case a -> fen.c;
         case b -> fen.a;
      };
   }

   public fen a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
