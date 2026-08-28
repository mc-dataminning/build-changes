public enum eby implements bao {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private eby(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public eby a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
