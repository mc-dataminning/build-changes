public record fea(fbs b, fbs c, fbs d) {
   public static final fea a = new fea(fbs.c, new fbs(0.0, 0.0, -1.0), new fbs(0.0, 1.0, 0.0));

   public fbs a() {
      return this.c.c(this.d);
   }
}
