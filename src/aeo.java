public record aeo(float b, boolean c) implements yb<aam> {
   public static final xs<uu, aeo> a = yb.a(aeo::a, aeo::new);

   private aeo(uu $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static aeo a(bno $$0) {
      return new aeo($$0.f(), $$0.l());
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<aeo> a() {
      return aex.cd;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
