public record erw(epr b, epr c, epr d) {
   public static final erw a = new erw(epr.b, new epr(0.0, 0.0, -1.0), new epr(0.0, 1.0, 0.0));

   public epr a() {
      return this.c.c(this.d);
   }
}
