public record eoh(emc b, emc c, emc d) {
   public static final eoh a = new eoh(emc.b, new emc(0.0, 0.0, -1.0), new emc(0.0, 1.0, 0.0));

   public emc a() {
      return this.c.c(this.d);
   }
}
