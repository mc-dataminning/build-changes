public record exv(evq b, evq c, evq d) {
   public static final exv a = new exv(evq.b, new evq(0.0, 0.0, -1.0), new evq(0.0, 1.0, 0.0));

   public evq a() {
      return this.c.c(this.d);
   }
}
