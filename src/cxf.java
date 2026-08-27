public abstract class cxf implements cxw<bpp> {
   protected final cyb<?> a;
   protected final cxl b;
   protected final String c;
   protected final cxt d;
   protected final ctq e;
   protected final float f;
   protected final int g;

   public cxf(cyb<?> $$0, String $$1, cxl $$2, cxt $$3, ctq $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bpp $$0, daz $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public ctq a(bpp $$0, iz.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jg<cxt> a() {
      jg<cxt> $$0 = jg.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public ctq a(iz.a $$0) {
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
   public cyb<?> e() {
      return this.a;
   }

   public cxl f() {
      return this.b;
   }

   public interface a<T extends cxf> {
      T create(String var1, cxl var2, cxt var3, ctq var4, float var5, int var6);
   }
}
