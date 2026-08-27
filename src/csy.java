public abstract class csy implements ctp<bmw> {
   protected final ctu<?> a;
   protected final cte b;
   protected final String c;
   protected final ctm d;
   protected final cqm e;
   protected final float f;
   protected final int g;

   public csy(ctu<?> $$0, String $$1, cte $$2, ctm $$3, cqm $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bmw $$0, cxb $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cqm a(bmw $$0, iz $$1) {
      return this.e.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iu<ctm> a() {
      iu<ctm> $$0 = iu.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cqm a(iz $$0) {
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
   public ctu<?> e() {
      return this.a;
   }

   public cte f() {
      return this.b;
   }

   public interface a<T extends csy> {
      T create(String var1, cte var2, ctm var3, cqm var4, float var5, int var6);
   }
}
