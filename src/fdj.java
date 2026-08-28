public record fdj(fba b, fba c, fba d) {
   public static final fdj a = new fdj(fba.c, new fba(0.0, 0.0, -1.0), new fba(0.0, 1.0, 0.0));

   public fba a() {
      return this.c.c(this.d);
   }
}
