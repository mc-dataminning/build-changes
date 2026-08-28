public enum dwn implements bai {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dwn(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dwn a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
