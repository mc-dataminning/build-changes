public enum dho implements aub {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dho(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dho a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
