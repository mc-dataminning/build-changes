public enum dst implements azt {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dst(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dst a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
