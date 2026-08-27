public class aew implements ze<abq> {
   public static final yv<vx, aew> a = ze.a(aew::a, aew::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public aew(bru $$0) {
      this($$0.al(), $$0.ds());
   }

   public aew(int $$0, euk $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = ayd.a($$1.c, -3.9, 3.9);
      double $$4 = ayd.a($$1.d, -3.9, 3.9);
      double $$5 = ayd.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private aew(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zg<aew> a() {
      return agb.aE;
   }

   public void a(abq $$0) {
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
