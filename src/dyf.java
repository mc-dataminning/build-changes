public enum dyf implements bba {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dyf(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dyf a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
