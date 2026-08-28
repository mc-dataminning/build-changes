public record eye(evz b, evz c, evz d) {
   public static final eye a = new eye(evz.b, new evz(0.0, 0.0, -1.0), new evz(0.0, 1.0, 0.0));

   public evz a() {
      return this.c.c(this.d);
   }
}
