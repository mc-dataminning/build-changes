public abstract class cxd implements cxu<bpn> {
   protected final cxz<?> a;
   protected final cxj b;
   protected final String c;
   protected final cxr d;
   protected final cto e;
   protected final float f;
   protected final int g;

   public cxd(cxz<?> $$0, String $$1, cxj $$2, cxr $$3, cto $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bpn $$0, dax $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cto a(bpn $$0, iz.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jg<cxr> a() {
      jg<cxr> $$0 = jg.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cto a(iz.a $$0) {
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
   public cxz<?> e() {
      return this.a;
   }

   public cxj f() {
      return this.b;
   }

   public interface a<T extends cxd> {
      T create(String var1, cxj var2, cxr var3, cto var4, float var5, int var6);
   }
}
