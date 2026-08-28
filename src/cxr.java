public abstract class cxr implements cyj<cyz> {
   protected final cyp<?> a;
   protected final cxx b;
   protected final String c;
   protected final cyg d;
   protected final cud e;
   protected final float f;
   protected final int g;

   public cxr(cyp<?> $$0, String $$1, cxx $$2, cyg $$3, cud $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(cyz $$0, dcg $$1) {
      return this.d.a($$0.c());
   }

   public cud a(cyz $$0, jl.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public js<cyg> a() {
      js<cyg> $$0 = js.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cud a(jl.a $$0) {
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
   public cyp<?> e() {
      return this.a;
   }

   public cxx f() {
      return this.b;
   }

   public interface a<T extends cxr> {
      T create(String var1, cxx var2, cyg var3, cud var4, float var5, int var6);
   }
}
