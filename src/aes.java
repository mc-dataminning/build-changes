public class aes implements zb<abm> {
   public static final ys<vu, aes> a = zb.a(aes::a, aes::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public aes(brh $$0) {
      this($$0.aj(), $$0.dq());
   }

   public aes(int $$0, etp $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = axz.a($$1.c, -3.9, 3.9);
      double $$4 = axz.a($$1.d, -3.9, 3.9);
      double $$5 = axz.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private aes(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zd<aes> a() {
      return afx.aE;
   }

   public void a(abm $$0) {
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
