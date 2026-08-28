public class ahw implements zl<agr> {
   public static final zc<wb, ahw> a = zl.a(ahw::a, ahw::new);
   private final jf b;
   private final jk c;
   private final ahw.a d;
   private final int e;

   public ahw(ahw.a $$0, jf $$1, jk $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahw(ahw.a $$0, jf $$1, jk $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahw(wb $$0) {
      this.d = $$0.b(ahw.a.class);
      this.b = $$0.e();
      this.c = jk.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wb $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zn<ahw> a() {
      return agp.bN;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public jf b() {
      return this.b;
   }

   public jk e() {
      return this.c;
   }

   public ahw.a f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
