public abstract class cpk implements cqb<bjt> {
   protected final cqg<?> a;
   protected final cpq b;
   protected final String c;
   protected final cpy d;
   protected final cmx e;
   protected final float f;
   protected final int g;

   public cpk(cqg<?> $$0, String $$1, cpq $$2, cpy $$3, cmx $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bjt $$0, cto $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cmx a(bjt $$0, iu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iq<cpy> a() {
      iq<cpy> $$0 = iq.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cmx a(iu $$0) {
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
   public cqg<?> e() {
      return this.a;
   }

   public cpq f() {
      return this.b;
   }

   public interface a<T extends cpk> {
      T create(String var1, cpq var2, cpy var3, cmx var4, float var5, int var6);
   }
}
