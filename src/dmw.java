public enum dmw implements axg {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dmw(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dmw a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
