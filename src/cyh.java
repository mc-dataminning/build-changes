public abstract class cyh implements cza<bpt> {
   protected final czf<?> a;
   protected final cyn b;
   protected final String c;
   protected final cyv d;
   protected final cuh e;
   protected final float f;
   protected final int g;

   public cyh(czf<?> $$0, String $$1, cyn $$2, cyv $$3, cuh $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bpt $$0, dca $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cuh a(bpt $$0, jc.a $$1) {
      return this.e.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jj<cyv> a() {
      jj<cyv> $$0 = jj.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuh a(jc.a $$0) {
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
   public czf<?> e() {
      return this.a;
   }

   public cyn f() {
      return this.b;
   }

   public interface a<T extends cyh> {
      T create(String var1, cyn var2, cyv var3, cuh var4, float var5, int var6);
   }
}
