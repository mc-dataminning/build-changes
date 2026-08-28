public abstract class cye implements cyv<bqn> {
   protected final cza<?> a;
   protected final cyk b;
   protected final String c;
   protected final cys d;
   protected final cup e;
   protected final float f;
   protected final int g;

   public cye(cza<?> $$0, String $$1, cyk $$2, cys $$3, cup $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bqn $$0, dby $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cup a(bqn $$0, jk.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jr<cys> a() {
      jr<cys> $$0 = jr.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cup a(jk.a $$0) {
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
   public cza<?> e() {
      return this.a;
   }

   public cyk f() {
      return this.b;
   }

   public interface a<T extends cye> {
      T create(String var1, cyk var2, cys var3, cup var4, float var5, int var6);
   }
}
