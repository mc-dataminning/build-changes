public enum dqz implements ayt {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dqz(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dqz a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
