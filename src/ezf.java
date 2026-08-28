public record ezf(exa b, exa c, exa d) {
   public static final ezf a = new ezf(exa.b, new exa(0.0, 0.0, -1.0), new exa(0.0, 1.0, 0.0));

   public exa a() {
      return this.c.c(this.d);
   }
}
