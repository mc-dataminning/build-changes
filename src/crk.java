public abstract class crk implements csb<bln> {
   protected final csg<?> a;
   protected final crq b;
   protected final String c;
   protected final cry d;
   protected final coz e;
   protected final float f;
   protected final int g;

   public crk(csg<?> $$0, String $$1, crq $$2, cry $$3, coz $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bln $$0, cvn $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public coz a(bln $$0, iw $$1) {
      return this.e.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public is<cry> a() {
      is<cry> $$0 = is.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public coz a(iw $$0) {
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
   public csg<?> e() {
      return this.a;
   }

   public crq f() {
      return this.b;
   }

   public interface a<T extends crk> {
      T create(String var1, crq var2, cry var3, coz var4, float var5, int var6);
   }
}
