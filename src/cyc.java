public abstract class cyc implements cyt<bql> {
   protected final cyy<?> a;
   protected final cyi b;
   protected final String c;
   protected final cyq d;
   protected final cun e;
   protected final float f;
   protected final int g;

   public cyc(cyy<?> $$0, String $$1, cyi $$2, cyq $$3, cun $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bql $$0, dbw $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cun a(bql $$0, jk.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jr<cyq> a() {
      jr<cyq> $$0 = jr.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cun a(jk.a $$0) {
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
   public cyy<?> e() {
      return this.a;
   }

   public cyi f() {
      return this.b;
   }

   public interface a<T extends cyc> {
      T create(String var1, cyi var2, cyq var3, cun var4, float var5, int var6);
   }
}
