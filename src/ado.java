public class ado implements xz<aai> {
   public static final xq<us, ado> a = xz.a(ado::a, ado::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public ado(bof $$0) {
      this($$0.aj(), $$0.dm());
   }

   public ado(int $$0, eov $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = awm.a($$1.c, -3.9, 3.9);
      double $$4 = awm.a($$1.d, -3.9, 3.9);
      double $$5 = awm.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private ado(us $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public yb<ado> a() {
      return aet.aE;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }
}
