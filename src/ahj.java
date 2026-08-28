public record ahj(int b, int c, boolean d) implements zs<ags> {
   public static final zj<wl, ahj> a = zs.a(ahj::a, ahj::new);

   private ahj(wl $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<ahj> a() {
      return agq.bu;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
