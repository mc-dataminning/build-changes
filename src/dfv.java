public enum dfv implements asu {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dfv(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dfv a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
