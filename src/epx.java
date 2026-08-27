public record epx(ens b, ens c, ens d) {
   public static final epx a = new epx(ens.b, new ens(0.0, 0.0, -1.0), new ens(0.0, 1.0, 0.0));

   public ens a() {
      return this.c.c(this.d);
   }
}
