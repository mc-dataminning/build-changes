public class aax implements wb<xu> {
   private final int a;
   private final int b;
   private final int c;
   private final int d;

   public aax(bjt $$0) {
      this($$0.ah(), $$0.do());
   }

   public aax(int $$0, eif $$1) {
      this.a = $$0;
      double $$2 = 3.9;
      double $$3 = asy.a($$1.c, -3.9, 3.9);
      double $$4 = asy.a($$1.d, -3.9, 3.9);
      double $$5 = asy.a($$1.e, -3.9, 3.9);
      this.b = (int)($$3 * 8000.0);
      this.c = (int)($$4 * 8000.0);
      this.d = (int)($$5 * 8000.0);
   }

   public aax(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.readShort();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.l(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
