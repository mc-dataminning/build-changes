public enum dvg implements azz {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dvg(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dvg a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
