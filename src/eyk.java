public record eyk(ewf b, ewf c, ewf d) {
   public static final eyk a = new eyk(ewf.b, new ewf(0.0, 0.0, -1.0), new ewf(0.0, 1.0, 0.0));

   public ewf a() {
      return this.c.c(this.d);
   }
}
