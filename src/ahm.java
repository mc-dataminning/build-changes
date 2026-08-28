public record ahm(int b, int c, boolean d) implements zv<agv> {
   public static final zm<wl, ahm> a = zv.a(ahm::a, ahm::new);

   private ahm(wl $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zx<ahm> a() {
      return agt.bu;
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
