public abstract class cyf implements cyw<bqo> {
   protected final czb<?> a;
   protected final cyl b;
   protected final String c;
   protected final cyt d;
   protected final cuq e;
   protected final float f;
   protected final int g;

   public cyf(czb<?> $$0, String $$1, cyl $$2, cyt $$3, cuq $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bqo $$0, dbz $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cuq a(bqo $$0, jk.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jr<cyt> a() {
      jr<cyt> $$0 = jr.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuq a(jk.a $$0) {
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
   public czb<?> e() {
      return this.a;
   }

   public cyl f() {
      return this.b;
   }

   public interface a<T extends cyf> {
      T create(String var1, cyl var2, cyt var3, cuq var4, float var5, int var6);
   }
}
