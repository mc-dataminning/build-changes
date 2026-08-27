public class agq implements yp<afn> {
   public static final yg<vi, agq> a = yp.a(agq::a, agq::new);
   private final id b;
   private final ij c;
   private final agq.a d;
   private final int e;

   public agq(agq.a $$0, id $$1, ij $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public agq(agq.a $$0, id $$1, ij $$2) {
      this($$0, $$1, $$2, 0);
   }

   private agq(vi $$0) {
      this.d = $$0.b(agq.a.class);
      this.b = $$0.e();
      this.c = ij.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vi $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public yr<agq> a() {
      return afl.bI;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public ij e() {
      return this.c;
   }

   public agq.a f() {
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
