public class afo implements zv<ach> {
   public static final zm<wl, afo> a = zv.a(afo::a, afo::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public afo(bss $$0) {
      this($$0.al(), $$0.ds());
   }

   public afo(int $$0, evp $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = ayx.a($$1.c, -3.9, 3.9);
      double $$4 = ayx.a($$1.d, -3.9, 3.9);
      double $$5 = ayx.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private afo(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zx<afo> a() {
      return agt.aE;
   }

   public void a(ach $$0) {
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
