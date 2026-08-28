public enum fsk {
   a,
   b;

   public fsk a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public fsl b() {
      return switch (this) {
         case a -> fsl.d;
         case b -> fsl.b;
      };
   }

   public fsl c() {
      return switch (this) {
         case a -> fsl.c;
         case b -> fsl.a;
      };
   }

   public fsl a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
