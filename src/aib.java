public class aib implements zq<agw> {
   public static final zh<wg, aib> a = zq.a(aib::a, aib::new);
   private final jh b;
   private final jm c;
   private final aib.a d;
   private final int e;

   public aib(aib.a $$0, jh $$1, jm $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public aib(aib.a $$0, jh $$1, jm $$2) {
      this($$0, $$1, $$2, 0);
   }

   private aib(wg $$0) {
      this.d = $$0.b(aib.a.class);
      this.b = $$0.e();
      this.c = jm.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wg $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zs<aib> a() {
      return agu.bN;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public jm e() {
      return this.c;
   }

   public aib.a f() {
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
