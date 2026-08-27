public enum djy implements avj {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private djy(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public djy a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
