public record exy(evt b, evt c, evt d) {
   public static final exy a = new exy(evt.b, new evt(0.0, 0.0, -1.0), new evt(0.0, 1.0, 0.0));

   public evt a() {
      return this.c.c(this.d);
   }
}
