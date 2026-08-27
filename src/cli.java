public abstract class cli implements clz<bgh> {
   protected final cmc<?> a;
   protected final aep b;
   private final clo h;
   protected final String c;
   protected final clw d;
   protected final ciw e;
   protected final float f;
   protected final int g;

   public cli(cmc<?> $$0, aep $$1, String $$2, clo $$3, clw $$4, ciw $$5, float $$6, int $$7) {
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
   public boolean a(bgh $$0, cpk $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public ciw a(bgh $$0, ht $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public ho<clw> a() {
      ho<clw> $$0 = ho.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public ciw a(ht $$0) {
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
   public aep e() {
      return this.b;
   }

   @Override
   public cmc<?> f() {
      return this.a;
   }

   public clo g() {
      return this.h;
   }
}
