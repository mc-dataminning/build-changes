public record ahj(int b, int c, boolean d) implements zl<agr> {
   public static final zc<wb, ahj> a = zl.a(ahj::a, ahj::new);

   private ahj(wb $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahj> a() {
      return agp.bx;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
