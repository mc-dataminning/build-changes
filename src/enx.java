public record enx(els b, els c, els d) {
   public static final enx a = new enx(els.b, new els(0.0, 0.0, -1.0), new els(0.0, 1.0, 0.0));

   public els a() {
      return this.c.c(this.d);
   }
}
