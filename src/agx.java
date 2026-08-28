public record agx(int b, int c, boolean d) implements yv<agf> {
   public static final ym<vl, agx> a = yv.a(agx::a, agx::new);

   private agx(vl $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public yx<agx> a() {
      return agd.bB;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
