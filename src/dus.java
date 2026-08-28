public enum dus implements azy {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dus(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dus a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
