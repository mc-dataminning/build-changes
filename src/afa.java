public class afa implements zf<abt> {
   public static final yw<vv, afa> a = zf.a(afa::a, afa::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public afa(bsq $$0) {
      this($$0.an(), $$0.dt());
   }

   public afa(int $$0, eww $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = ayn.a($$1.c, -3.9, 3.9);
      double $$4 = ayn.a($$1.d, -3.9, 3.9);
      double $$5 = ayn.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private afa(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zh<afa> a() {
      return agf.aE;
   }

   public void a(abt $$0) {
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
