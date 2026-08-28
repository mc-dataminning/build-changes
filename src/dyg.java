public enum dyg implements baq {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dyg(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dyg a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
