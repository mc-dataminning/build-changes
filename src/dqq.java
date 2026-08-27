public enum dqq implements ayq {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dqq(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dqq a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
