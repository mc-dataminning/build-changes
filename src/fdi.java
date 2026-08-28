public record fdi(faz b, faz c, faz d) {
   public static final fdi a = new fdi(faz.c, new faz(0.0, 0.0, -1.0), new faz(0.0, 1.0, 0.0));

   public faz a() {
      return this.c.c(this.d);
   }
}
