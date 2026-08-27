public abstract class cvp implements cwg<boj> {
   protected final cwl<?> a;
   protected final cvv b;
   protected final String c;
   protected final cwd d;
   protected final csd e;
   protected final float f;
   protected final int g;

   public cvp(cwl<?> $$0, String $$1, cvv $$2, cwd $$3, csd $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(boj $$0, czu $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public csd a(boj $$0, jj $$1) {
      return this.e.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public je<cwd> a() {
      je<cwd> $$0 = je.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public csd a(jj $$0) {
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
   public cwl<?> e() {
      return this.a;
   }

   public cvv f() {
      return this.b;
   }

   public interface a<T extends cvp> {
      T create(String var1, cvv var2, cwd var3, csd var4, float var5, int var6);
   }
}
