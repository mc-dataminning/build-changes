public record aie(int b, int c, boolean d) implements aac<ahm> {
   public static final zt<ws, aie> a = aac.a(aie::a, aie::new);

   private aie(ws $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public aae<aie> a() {
      return ahk.bB;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
