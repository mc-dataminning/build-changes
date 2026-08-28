public enum dvv implements baf {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dvv(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dvv a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
