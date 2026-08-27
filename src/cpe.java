public abstract class cpe implements cpv<bjo> {
   protected final cqa<?> a;
   protected final cpk b;
   protected final String c;
   protected final cps d;
   protected final cmr e;
   protected final float f;
   protected final int g;

   public cpe(cqa<?> $$0, String $$1, cpk $$2, cps $$3, cmr $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bjo $$0, cti $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cmr a(bjo $$0, iu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iq<cps> a() {
      iq<cps> $$0 = iq.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cmr a(iu $$0) {
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
   public cqa<?> e() {
      return this.a;
   }

   public cpk f() {
      return this.b;
   }

   public interface a<T extends cpe> {
      T create(String var1, cpk var2, cps var3, cmr var4, float var5, int var6);
   }
}
