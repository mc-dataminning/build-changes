public abstract class clx implements cmp<bgx> {
   protected final cmt<?> a;
   protected final cmd b;
   protected final String c;
   protected final cmm d;
   protected final cjl e;
   protected final float f;
   protected final int g;

   public clx(cmt<?> $$0, String $$1, cmd $$2, cmm $$3, cjl $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bgx $$0, cqb $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cjl a(bgx $$0, hr $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hn<cmm> a() {
      hn<cmm> $$0 = hn.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cjl a(hr $$0) {
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
   public cmt<?> e() {
      return this.a;
   }

   public cmd f() {
      return this.b;
   }
}
