public record ewr(eum b, eum c, eum d) {
   public static final ewr a = new ewr(eum.b, new eum(0.0, 0.0, -1.0), new eum(0.0, 1.0, 0.0));

   public eum a() {
      return this.c.c(this.d);
   }
}
