public record era(eov b, eov c, eov d) {
   public static final era a = new era(eov.b, new eov(0.0, 0.0, -1.0), new eov(0.0, 1.0, 0.0));

   public eov a() {
      return this.c.c(this.d);
   }
}
