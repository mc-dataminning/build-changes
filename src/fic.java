public record fic(ffs b, ffs c, ffs d) {
   public static final fic a = new fic(ffs.c, new ffs(0.0, 0.0, -1.0), new ffs(0.0, 1.0, 0.0));

   public ffs a() {
      return this.c.c(this.d);
   }
}
