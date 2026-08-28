public class afm implements zp<ace> {
   public static final zg<wf, afm> a = zp.a(afm::a, afm::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public afm(bue $$0) {
      this($$0.as(), $$0.dA());
   }

   public afm(int $$0, ezn $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = azk.a($$1.d, -3.9, 3.9);
      double $$4 = azk.a($$1.e, -3.9, 3.9);
      double $$5 = azk.a($$1.f, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private afm(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
      $$0.m(this.e);
   }

   @Override
   public zr<afm> a() {
      return agt.aE;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return (double)this.c / 8000.0;
   }

   public double f() {
      return (double)this.d / 8000.0;
   }

   public double g() {
      return (double)this.e / 8000.0;
   }
}
