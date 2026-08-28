public record ahn(int b, int c, boolean d) implements zp<agv> {
   public static final zg<wf, ahn> a = zp.a(ahn::a, ahn::new);

   private ahn(wf $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<ahn> a() {
      return agt.bx;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
