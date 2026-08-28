public enum dxn implements azu {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dxn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dxn a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
