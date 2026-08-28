public record fgf(fdw b, fdw c, fdw d) {
   public static final fgf a = new fgf(fdw.c, new fdw(0.0, 0.0, -1.0), new fdw(0.0, 1.0, 0.0));

   public fdw a() {
      return this.c.c(this.d);
   }
}
