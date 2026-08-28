public abstract class cyf implements cyx<czn> {
   protected final czd<?> a;
   protected final cyl b;
   protected final String c;
   protected final cyu d;
   protected final cuo e;
   protected final float f;
   protected final int g;

   public cyf(czd<?> $$0, String $$1, cyl $$2, cyu $$3, cuo $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public boolean a(czn $$0, dcu $$1) {
      return this.d.a($$0.c());
   }

   public cuo a(czn $$0, jo.a $$1) {
      return this.e.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public jv<cyu> a() {
      jv<cyu> $$0 = jv.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cuo a(jo.a $$0) {
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
   public czd<?> e() {
      return this.a;
   }

   public cyl f() {
      return this.b;
   }

   public interface a<T extends cyf> {
      T create(String var1, cyl var2, cyu var3, cuo var4, float var5, int var6);
   }
}
