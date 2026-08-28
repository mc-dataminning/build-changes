public record fay(eys b, eys c, eys d) {
   public static final fay a = new fay(eys.c, new eys(0.0, 0.0, -1.0), new eys(0.0, 1.0, 0.0));

   public eys a() {
      return this.c.c(this.d);
   }
}
