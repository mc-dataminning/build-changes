public record ahf(int b, int c, boolean d) implements zd<agn> {
   public static final yu<vs, ahf> a = zd.a(ahf::a, ahf::new);

   private ahf(vs $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public zf<ahf> a() {
      return agl.bB;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
