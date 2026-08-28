public enum dwb implements bag {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dwb(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dwb a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
