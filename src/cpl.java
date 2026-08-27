public abstract class cpl implements cqc<bju> {
   protected final cqh<?> a;
   protected final cpr b;
   protected final String c;
   protected final cpz d;
   protected final cmy e;
   protected final float f;
   protected final int g;

   public cpl(cqh<?> $$0, String $$1, cpr $$2, cpz $$3, cmy $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bju $$0, ctp $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cmy a(bju $$0, iu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iq<cpz> a() {
      iq<cpz> $$0 = iq.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cmy a(iu $$0) {
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
   public cqh<?> e() {
      return this.a;
   }

   public cpr f() {
      return this.b;
   }

   public interface a<T extends cpl> {
      T create(String var1, cpr var2, cpz var3, cmy var4, float var5, int var6);
   }
}
