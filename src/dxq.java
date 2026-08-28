public enum dxq implements azv {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dxq(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dxq a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
