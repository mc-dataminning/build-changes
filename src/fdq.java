public enum fdq {
   a,
   b;

   public fdq a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fdr b() {
      return switch (this) {
         case a -> fdr.d;
         case b -> fdr.b;
      };
   }

   public fdr c() {
      return switch (this) {
         case a -> fdr.c;
         case b -> fdr.a;
      };
   }

   public fdr a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
