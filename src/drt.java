public enum drt implements ayx {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private drt(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public drt a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
