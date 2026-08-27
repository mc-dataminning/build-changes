public abstract class clj implements cma<bgj> {
   protected final cmd<?> a;
   protected final aer b;
   private final clp h;
   protected final String c;
   protected final clx d;
   protected final cix e;
   protected final float f;
   protected final int g;

   public clj(cmd<?> $$0, aer $$1, String $$2, clp $$3, clx $$4, cix $$5, float $$6, int $$7) {
      this.a = $$0;
      this.h = $$3;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$5;
      this.f = $$6;
      this.g = $$7;
   }

   @Override
   public boolean a(bgj $$0, cpl $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cix a(bgj $$0, hs $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hn<clx> a() {
      hn<clx> $$0 = hn.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cix a(hs $$0) {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   public int d() {
      return this.g;
   }

   @Override
   public aer e() {
      return this.b;
   }

   @Override
   public cmd<?> f() {
      return this.a;
   }

   public clp g() {
      return this.h;
   }
}
