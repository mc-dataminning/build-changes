public record agl(float b, boolean c) implements zq<acf> {
   public static final zh<wg, agl> a = zq.a(agl::a, agl::new);

   private agl(wg $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agl a(bst $$0) {
      return new agl($$0.f(), $$0.l());
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zs<agl> a() {
      return agu.ci;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
