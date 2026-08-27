public class agc implements yb<aez> {
   public static final xs<uu, agc> a = yb.a(agc::a, agc::new);
   private final ib b;
   private final ih c;
   private final agc.a d;
   private final int e;

   public agc(agc.a $$0, ib $$1, ih $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public agc(agc.a $$0, ib $$1, ih $$2) {
      this($$0, $$1, $$2, 0);
   }

   private agc(uu $$0) {
      this.d = $$0.b(agc.a.class);
      this.b = $$0.e();
      this.c = ih.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(uu $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public yd<agc> a() {
      return aex.bI;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public ih e() {
      return this.c;
   }

   public agc.a f() {
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
