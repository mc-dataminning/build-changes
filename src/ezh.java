public record ezh(exc b, exc c, exc d) {
   public static final ezh a = new ezh(exc.b, new exc(0.0, 0.0, -1.0), new exc(0.0, 1.0, 0.0));

   public exc a() {
      return this.c.c(this.d);
   }
}
