public record exw(evr b, evr c, evr d) {
   public static final exw a = new exw(evr.b, new evr(0.0, 0.0, -1.0), new evr(0.0, 1.0, 0.0));

   public evr a() {
      return this.c.c(this.d);
   }
}
