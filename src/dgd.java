public enum dgd implements asr {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dgd(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dgd a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
