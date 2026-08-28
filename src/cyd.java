public abstract class cyd implements cyu<bqm> {
   protected final cyz<?> a;
   protected final cyj b;
   protected final String c;
   protected final cyr d;
   protected final cuo e;
   protected final float f;
   protected final int g;

   public cyd(cyz<?> $$0, String $$1, cyj $$2, cyr $$3, cuo $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bqm $$0, dbx $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cuo a(bqm $$0, jk.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jr<cyr> a() {
      jr<cyr> $$0 = jr.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuo a(jk.a $$0) {
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
   public cyz<?> e() {
      return this.a;
   }

   public cyj f() {
      return this.b;
   }

   public interface a<T extends cyd> {
      T create(String var1, cyj var2, cyr var3, cuo var4, float var5, int var6);
   }
}
