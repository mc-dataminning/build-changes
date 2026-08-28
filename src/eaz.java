public enum eaz implements bak {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private eaz(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public eaz a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
