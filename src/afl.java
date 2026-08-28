public class afl implements zs<ace> {
   public static final zj<wl, afl> a = zs.a(afl::a, afl::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public afl(bsp $$0) {
      this($$0.al(), $$0.ds());
   }

   public afl(int $$0, evm $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = ayu.a($$1.c, -3.9, 3.9);
      double $$4 = ayu.a($$1.d, -3.9, 3.9);
      double $$5 = ayu.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private afl(wl $$0) {
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
   public zu<afl> a() {
      return agq.aE;
   }

   public void a(ace $$0) {
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
