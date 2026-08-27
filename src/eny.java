public record eny(elt b, elt c, elt d) {
   public static final eny a = new eny(elt.b, new elt(0.0, 0.0, -1.0), new elt(0.0, 1.0, 0.0));

   public elt a() {
      return this.c.c(this.d);
   }
}
