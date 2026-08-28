public record agz(int b, int c, boolean d) implements zg<agi> {
   public static final yx<vw, agz> a = zg.a(agz::a, agz::new);

   private agz(vw $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<agz> a() {
      return agg.bu;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
