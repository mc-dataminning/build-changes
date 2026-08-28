public record ahq(int b, int c, boolean d) implements zs<agy> {
   public static final zj<wi, ahq> a = zs.a(ahq::a, ahq::new);

   private ahq(wi $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<ahq> a() {
      return agw.bx;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
