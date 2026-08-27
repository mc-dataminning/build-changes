public enum dqa implements ayg {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dqa(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dqa a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
