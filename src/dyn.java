public enum dyn implements bba {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dyn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dyn a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
