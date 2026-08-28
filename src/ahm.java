public record ahm(int b, int c, boolean d) implements zo<agu> {
   public static final zf<we, ahm> a = zo.a(ahm::a, ahm::new);

   private ahm(we $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<ahm> a() {
      return ags.bx;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
