public abstract class cus implements cvj<bnt> {
   protected final cvo<?> a;
   protected final cuy b;
   protected final String c;
   protected final cvg d;
   protected final crj e;
   protected final float f;
   protected final int g;

   public cus(cvo<?> $$0, String $$1, cuy $$2, cvg $$3, crj $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bnt $$0, cyx $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public crj a(bnt $$0, iz $$1) {
      return this.e.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public iu<cvg> a() {
      iu<cvg> $$0 = iu.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public crj a(iz $$0) {
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
   public cvo<?> e() {
      return this.a;
   }

   public cuy f() {
      return this.b;
   }

   public interface a<T extends cus> {
      T create(String var1, cuy var2, cvg var3, crj var4, float var5, int var6);
   }
}
