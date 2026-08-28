public enum ebl implements bak {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private ebl(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public ebl a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
