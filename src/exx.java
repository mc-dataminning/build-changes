public record exx(evs b, evs c, evs d) {
   public static final exx a = new exx(evs.b, new evs(0.0, 0.0, -1.0), new evs(0.0, 1.0, 0.0));

   public evs a() {
      return this.c.c(this.d);
   }
}
