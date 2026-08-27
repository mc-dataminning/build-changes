public record ery(ept b, ept c, ept d) {
   public static final ery a = new ery(ept.b, new ept(0.0, 0.0, -1.0), new ept(0.0, 1.0, 0.0));

   public ept a() {
      return this.c.c(this.d);
   }
}
