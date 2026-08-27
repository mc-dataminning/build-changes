public enum dlx implements axc {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dlx(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dlx a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
