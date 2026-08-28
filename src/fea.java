public record fea(fbr b, fbr c, fbr d) {
   public static final fea a = new fea(fbr.c, new fbr(0.0, 0.0, -1.0), new fbr(0.0, 1.0, 0.0));

   public fbr a() {
      return this.c.c(this.d);
   }
}
