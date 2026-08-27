public enum djz implements avk {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private djz(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public djz a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
