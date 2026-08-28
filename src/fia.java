public record fia(ffq b, ffq c, ffq d) {
   public static final fia a = new fia(ffq.c, new ffq(0.0, 0.0, -1.0), new ffq(0.0, 1.0, 0.0));

   public ffq a() {
      return this.c.c(this.d);
   }
}
