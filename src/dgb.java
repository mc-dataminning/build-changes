public enum dgb implements asp {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dgb(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dgb a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
