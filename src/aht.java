public record aht(int b, int c, boolean d) implements zr<ahb> {
   public static final zi<wh, aht> a = zr.a(aht::a, aht::new);

   private aht(wh $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zt<aht> a() {
      return agz.bB;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
