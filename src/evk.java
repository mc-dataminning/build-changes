public record evk(etf b, etf c, etf d) {
   public static final evk a = new evk(etf.b, new etf(0.0, 0.0, -1.0), new etf(0.0, 1.0, 0.0));

   public etf a() {
      return this.c.c(this.d);
   }
}
