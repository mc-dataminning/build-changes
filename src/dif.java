public enum dif implements auk {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dif(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dif a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
