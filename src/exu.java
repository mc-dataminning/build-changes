public record exu(evp b, evp c, evp d) {
   public static final exu a = new exu(evp.b, new evp(0.0, 0.0, -1.0), new evp(0.0, 1.0, 0.0));

   public evp a() {
      return this.c.c(this.d);
   }
}
