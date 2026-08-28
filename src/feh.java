public record feh(fby b, fby c, fby d) {
   public static final feh a = new feh(fby.c, new fby(0.0, 0.0, -1.0), new fby(0.0, 1.0, 0.0));

   public fby a() {
      return this.c.c(this.d);
   }
}
