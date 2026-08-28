public abstract class cyg implements cyx<bqp> {
   protected final czc<?> a;
   protected final cym b;
   protected final String c;
   protected final cyu d;
   protected final cur e;
   protected final float f;
   protected final int g;

   public cyg(czc<?> $$0, String $$1, cym $$2, cyu $$3, cur $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bqp $$0, dca $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cur a(bqp $$0, jk.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jr<cyu> a() {
      jr<cyu> $$0 = jr.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cur a(jk.a $$0) {
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
   public czc<?> e() {
      return this.a;
   }

   public cym f() {
      return this.b;
   }

   public interface a<T extends cyg> {
      T create(String var1, cym var2, cyu var3, cur var4, float var5, int var6);
   }
}
