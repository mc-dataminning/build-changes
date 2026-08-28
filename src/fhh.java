public record fhh(fex b, fex c, fex d) {
   public static final fhh a = new fhh(fex.c, new fex(0.0, 0.0, -1.0), new fex(0.0, 1.0, 0.0));

   public fex a() {
      return this.c.c(this.d);
   }
}
