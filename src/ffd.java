public record ffd(fcu b, fcu c, fcu d) {
   public static final ffd a = new ffd(fcu.c, new fcu(0.0, 0.0, -1.0), new fcu(0.0, 1.0, 0.0));

   public fcu a() {
      return this.c.c(this.d);
   }
}
