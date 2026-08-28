public abstract class cxq implements cyi<cyy> {
   protected final cyo<?> a;
   protected final cxw b;
   protected final String c;
   protected final cyf d;
   protected final cuc e;
   protected final float f;
   protected final int g;

   public cxq(cyo<?> $$0, String $$1, cxw $$2, cyf $$3, cuc $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(cyy $$0, dcf $$1) {
      return this.d.a($$0.c());
   }

   public cuc a(cyy $$0, jl.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public js<cyf> a() {
      js<cyf> $$0 = js.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuc a(jl.a $$0) {
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
   public cyo<?> e() {
      return this.a;
   }

   public cxw f() {
      return this.b;
   }

   public interface a<T extends cxq> {
      T create(String var1, cxw var2, cyf var3, cuc var4, float var5, int var6);
   }
}
