public enum dtu implements azk {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dtu(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dtu a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
