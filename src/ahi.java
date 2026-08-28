public record ahi(int b, int c, boolean d) implements zk<agq> {
   public static final zb<wa, ahi> a = zk.a(ahi::a, ahi::new);

   private ahi(wa $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<ahi> a() {
      return ago.bx;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
