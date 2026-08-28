public enum dtd implements azc {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dtd(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dtd a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
