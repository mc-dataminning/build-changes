public class afy implements xz<aev> {
   public static final xq<us, afy> a = xz.a(afy::a, afy::new);
   private final ib b;
   private final ih c;
   private final afy.a d;
   private final int e;

   public afy(afy.a $$0, ib $$1, ih $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public afy(afy.a $$0, ib $$1, ih $$2) {
      this($$0, $$1, $$2, 0);
   }

   private afy(us $$0) {
      this.d = $$0.b(afy.a.class);
      this.b = $$0.e();
      this.c = ih.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(us $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public yb<afy> a() {
      return aet.bI;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public ih e() {
      return this.c;
   }

   public afy.a f() {
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
