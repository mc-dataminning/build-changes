public class aib implements zp<agv> {
   public static final zg<wf, aib> a = zp.a(aib::a, aib::new);
   private final int b;
   private final aib.a c;
   private final int d;

   public aib(bue $$0, aib.a $$1) {
      this($$0, $$1, 0);
   }

   public aib(bue $$0, aib.a $$1, int $$2) {
      this.b = $$0.as();
      this.c = $$1;
      this.d = $$2;
   }

   private aib(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.b(aib.a.class);
      this.d = $$0.l();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.c(this.d);
   }

   @Override
   public zr<aib> a() {
      return agt.bO;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public aib.a e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h,
      i;
   }
}
