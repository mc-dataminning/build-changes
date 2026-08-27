public enum dkh implements avl {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dkh(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dkh a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
