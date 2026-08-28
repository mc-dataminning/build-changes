public record fgz(feq b, feq c, feq d) {
   public static final fgz a = new fgz(feq.c, new feq(0.0, 0.0, -1.0), new feq(0.0, 1.0, 0.0));

   public feq a() {
      return this.c.c(this.d);
   }
}
