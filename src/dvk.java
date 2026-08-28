public enum dvk implements bab {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dvk(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dvk a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
