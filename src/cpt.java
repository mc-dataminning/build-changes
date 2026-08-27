public abstract class cpt implements cqk<bjv> {
   protected final cqp<?> a;
   protected final cpz b;
   protected final String c;
   protected final cqh d;
   protected final cng e;
   protected final float f;
   protected final int g;

   public cpt(cqp<?> $$0, String $$1, cpz $$2, cqh $$3, cng $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bjv $$0, ctx $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cng a(bjv $$0, iu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iq<cqh> a() {
      iq<cqh> $$0 = iq.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cng a(iu $$0) {
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
   public cqp<?> e() {
      return this.a;
   }

   public cpz f() {
      return this.b;
   }

   public interface a<T extends cpt> {
      T create(String var1, cpz var2, cqh var3, cng var4, float var5, int var6);
   }
}
