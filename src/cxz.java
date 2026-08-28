public abstract class cxz implements cyq<bqi> {
   protected final cyv<?> a;
   protected final cyf b;
   protected final String c;
   protected final cyn d;
   protected final cuk e;
   protected final float f;
   protected final int g;

   public cxz(cyv<?> $$0, String $$1, cyf $$2, cyn $$3, cuk $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bqi $$0, dbt $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cuk a(bqi $$0, jk.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jr<cyn> a() {
      jr<cyn> $$0 = jr.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuk a(jk.a $$0) {
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
   public cyv<?> e() {
      return this.a;
   }

   public cyf f() {
      return this.b;
   }

   public interface a<T extends cxz> {
      T create(String var1, cyf var2, cyn var3, cuk var4, float var5, int var6);
   }
}
