public class ahf implements zb<agb> {
   public static final ys<vr, ahf> a = zb.a(ahf::a, ahf::new);
   private final ja b;
   private final jf c;
   private final ahf.a d;
   private final int e;

   public ahf(ahf.a $$0, ja $$1, jf $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public ahf(ahf.a $$0, ja $$1, jf $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahf(vr $$0) {
      this.d = $$0.b(ahf.a.class);
      this.b = $$0.e();
      this.c = jf.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vr $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zd<ahf> a() {
      return afz.bK;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public jf e() {
      return this.c;
   }

   public ahf.a f() {
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
