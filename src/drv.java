public enum drv implements ayz {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private drv(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public drv a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
