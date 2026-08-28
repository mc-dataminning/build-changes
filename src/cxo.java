public abstract class cxo implements cyg<cyw> {
   protected final cym<?> a;
   protected final cxu b;
   protected final String c;
   protected final cyd d;
   protected final cua e;
   protected final float f;
   protected final int g;

   public cxo(cym<?> $$0, String $$1, cxu $$2, cyd $$3, cua $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(cyw $$0, dcd $$1) {
      return this.d.a($$0.c());
   }

   public cua a(cyw $$0, jl.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public js<cyd> a() {
      js<cyd> $$0 = js.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cua a(jl.a $$0) {
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
   public cym<?> e() {
      return this.a;
   }

   public cxu f() {
      return this.b;
   }

   public interface a<T extends cxo> {
      T create(String var1, cxu var2, cyd var3, cua var4, float var5, int var6);
   }
}
