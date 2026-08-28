public record fhm(ffc b, ffc c, ffc d) {
   public static final fhm a = new fhm(ffc.c, new ffc(0.0, 0.0, -1.0), new ffc(0.0, 1.0, 0.0));

   public ffc a() {
      return this.c.c(this.d);
   }
}
