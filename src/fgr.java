public record fgr(fei b, fei c, fei d) {
   public static final fgr a = new fgr(fei.c, new fei(0.0, 0.0, -1.0), new fei(0.0, 1.0, 0.0));

   public fei a() {
      return this.c.c(this.d);
   }
}
