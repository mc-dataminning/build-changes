public abstract class cmv implements cnn<bhu> {
   protected final cnr<?> a;
   protected final cnb b;
   protected final String c;
   protected final cnk d;
   protected final ckj e;
   protected final float f;
   protected final int g;

   public cmv(cnr<?> $$0, String $$1, cnb $$2, cnk $$3, ckj $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bhu $$0, cqz $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public ckj a(bhu $$0, ip $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public il<cnk> a() {
      il<cnk> $$0 = il.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public ckj a(ip $$0) {
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
   public cnr<?> e() {
      return this.a;
   }

   public cnb f() {
      return this.b;
   }
}
