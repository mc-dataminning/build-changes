public enum eag implements bai {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private eag(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public eag a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
