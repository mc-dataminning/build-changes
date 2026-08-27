public enum djh implements aut {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private djh(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public djh a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
