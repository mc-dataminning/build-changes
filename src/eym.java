public record eym(ewh b, ewh c, ewh d) {
   public static final eym a = new eym(ewh.b, new ewh(0.0, 0.0, -1.0), new ewh(0.0, 1.0, 0.0));

   public ewh a() {
      return this.c.c(this.d);
   }
}
