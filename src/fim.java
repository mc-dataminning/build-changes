public record fim(fgc b, fgc c, fgc d) {
   public static final fim a = new fim(fgc.c, new fgc(0.0, 0.0, -1.0), new fgc(0.0, 1.0, 0.0));

   public fgc a() {
      return this.c.c(this.d);
   }
}
