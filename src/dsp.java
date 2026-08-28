public enum dsp implements azp {
   a("single"),
   b("left"),
   c("right");

   private final String d;

   private dsp(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public dsp a() {
      return switch (this) {
         case a -> a;
         case b -> c;
         case c -> b;
      };
   }
}
