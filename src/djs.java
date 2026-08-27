public enum djs implements ave {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private djs(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public djs a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
