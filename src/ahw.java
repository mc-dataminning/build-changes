public class ahw implements zs<ags> {
   public static final zj<wl, ahw> a = zs.a(ahw::a, ahw::new);
   private final iz b;
   private final je c;
   private final ahw.a d;
   private final int e;

   public ahw(ahw.a $$0, iz $$1, je $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public ahw(ahw.a $$0, iz $$1, je $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahw(wl $$0) {
      this.d = $$0.b(ahw.a.class);
      this.b = $$0.e();
      this.c = je.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wl $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zu<ahw> a() {
      return agq.bK;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public je e() {
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
