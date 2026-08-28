public record ahl(int b, int c, boolean d) implements zj<agt> {
   public static final za<vy, ahl> a = zj.a(ahl::a, ahl::new);

   private ahl(vy $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zl<ahl> a() {
      return agr.bB;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
