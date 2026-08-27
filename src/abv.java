public record abv(int b, float c) implements yb<aam> {
   public static final xs<uu, abv> a = yb.a(abv::a, abv::new);

   public abv(bpo $$0) {
      this($$0.aj(), $$0.eG());
   }

   private abv(uu $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<abv> a() {
      return aex.I;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
