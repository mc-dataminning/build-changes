public enum dfr implements ash {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dfr(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dfr a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
