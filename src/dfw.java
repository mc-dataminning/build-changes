public enum dfw implements ask {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dfw(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dfw a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
