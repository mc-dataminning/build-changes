public class aig implements zo<aha> {
   public static final ze<vy, aig> a = zo.a(aig::a, aig::new);
   private final iw b;
   private final jc c;
   private final aig.a d;
   private final int e;

   public aig(aig.a $$0, iw $$1, jc $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public aig(aig.a $$0, iw $$1, jc $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aig(vy $$0) {
      this.d = $$0.b(aig.a.class);
      this.b = $$0.e();
      this.c = jc.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vy $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zq<aig> a() {
      return agy.bS;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public jc e() {
      return this.c;
   }

   public aig.a f() {
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
