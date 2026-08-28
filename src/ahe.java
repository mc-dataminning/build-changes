public record ahe(int b, int c, boolean d) implements zc<agm> {
   public static final yt<vr, ahe> a = zc.a(ahe::a, ahe::new);

   private ahe(vr $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public ze<ahe> a() {
      return agk.bB;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
