public record fbc(eyw b, eyw c, eyw d) {
   public static final fbc a = new fbc(eyw.c, new eyw(0.0, 0.0, -1.0), new eyw(0.0, 1.0, 0.0));

   public eyw a() {
      return this.c.c(this.d);
   }
}
