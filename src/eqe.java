public record eqe(enz b, enz c, enz d) {
   public static final eqe a = new eqe(enz.b, new enz(0.0, 0.0, -1.0), new enz(0.0, 1.0, 0.0));

   public enz a() {
      return this.c.c(this.d);
   }
}
