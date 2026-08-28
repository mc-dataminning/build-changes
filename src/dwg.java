public enum dwg implements baj {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dwg(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dwg a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
