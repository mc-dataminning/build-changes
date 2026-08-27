public record euf(esa b, esa c, esa d) {
   public static final euf a = new euf(esa.b, new esa(0.0, 0.0, -1.0), new esa(0.0, 1.0, 0.0));

   public esa a() {
      return this.c.c(this.d);
   }
}
