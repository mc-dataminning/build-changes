public enum dpr implements aye {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dpr(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dpr a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
