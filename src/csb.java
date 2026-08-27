public abstract class csb implements css<bme> {
   protected final csx<?> a;
   protected final csh b;
   protected final String c;
   protected final csp d;
   protected final cpq e;
   protected final float f;
   protected final int g;

   public csb(csx<?> $$0, String $$1, csh $$2, csp $$3, cpq $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bme $$0, cwe $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cpq a(bme $$0, iy $$1) {
      return this.e.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iu<csp> a() {
      iu<csp> $$0 = iu.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cpq a(iy $$0) {
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
   public csx<?> e() {
      return this.a;
   }

   public csh f() {
      return this.b;
   }

   public interface a<T extends csb> {
      T create(String var1, csh var2, csp var3, cpq var4, float var5, int var6);
   }
}
