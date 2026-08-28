public abstract class cyh implements cyz<czp> {
   protected final czf<?> a;
   protected final cyn b;
   protected final String c;
   protected final cyw d;
   protected final cuq e;
   protected final float f;
   protected final int g;

   public cyh(czf<?> $$0, String $$1, cyn $$2, cyw $$3, cuq $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(czp $$0, dcw $$1) {
      return this.d.a($$0.c());
   }

   public cuq a(czp $$0, jo.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jv<cyw> a() {
      jv<cyw> $$0 = jv.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuq a(jo.a $$0) {
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
   public czf<?> e() {
      return this.a;
   }

   public cyn f() {
      return this.b;
   }

   public interface a<T extends cyh> {
      T create(String var1, cyn var2, cyw var3, cuq var4, float var5, int var6);
   }
}
