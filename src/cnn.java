public abstract class cnn implements cof<bij> {
   protected final cok<?> a;
   protected final cnt b;
   protected final String c;
   protected final coc d;
   protected final clb e;
   protected final float f;
   protected final int g;

   public cnn(cok<?> $$0, String $$1, cnt $$2, coc $$3, clb $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bij $$0, crs $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public clb a(bij $$0, ip $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public il<coc> a() {
      il<coc> $$0 = il.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public clb a(ip $$0) {
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
   public cok<?> e() {
      return this.a;
   }

   public cnt f() {
      return this.b;
   }
}
