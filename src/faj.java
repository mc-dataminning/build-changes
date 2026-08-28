public record faj(eye b, eye c, eye d) {
   public static final faj a = new faj(eye.c, new eye(0.0, 0.0, -1.0), new eye(0.0, 1.0, 0.0));

   public eye a() {
      return this.c.c(this.d);
   }
}
