public abstract class cou implements cpl<bje> {
   protected final cpq<?> a;
   protected final cpa b;
   protected final String c;
   protected final cpi d;
   protected final cmh e;
   protected final float f;
   protected final int g;

   public cou(cpq<?> $$0, String $$1, cpa $$2, cpi $$3, cmh $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bje $$0, csy $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cmh a(bje $$0, is $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public io<cpi> a() {
      io<cpi> $$0 = io.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cmh a(is $$0) {
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
   public cpq<?> e() {
      return this.a;
   }

   public cpa f() {
      return this.b;
   }

   public interface a<T extends cou> {
      T create(String var1, cpa var2, cpi var3, cmh var4, float var5, int var6);
   }
}
