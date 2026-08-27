public class ahc implements zb<afz> {
   public static final ys<vu, ahc> a = zb.a(ahc::a, ahc::new);
   private final in b;
   private final is c;
   private final ahc.a d;
   private final int e;

   public ahc(ahc.a $$0, in $$1, is $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public ahc(ahc.a $$0, in $$1, is $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahc(vu $$0) {
      this.d = $$0.b(ahc.a.class);
      this.b = $$0.e();
      this.c = is.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vu $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zd<ahc> a() {
      return afx.bI;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public is e() {
      return this.c;
   }

   public ahc.a f() {
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
