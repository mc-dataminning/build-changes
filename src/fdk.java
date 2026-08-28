public record fdk(fbb b, fbb c, fbb d) {
   public static final fdk a = new fdk(fbb.c, new fbb(0.0, 0.0, -1.0), new fbb(0.0, 1.0, 0.0));

   public fbb a() {
      return this.c.c(this.d);
   }
}
