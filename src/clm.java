public abstract class clm implements cme<bgm> {
   protected final cmi<?> a;
   protected final cls b;
   protected final String c;
   protected final cmb d;
   protected final cja e;
   protected final float f;
   protected final int g;

   public clm(cmi<?> $$0, String $$1, cls $$2, cmb $$3, cja $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bgm $$0, cpq $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cja a(bgm $$0, hu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hp<cmb> a() {
      hp<cmb> $$0 = hp.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cja a(hu $$0) {
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
   public cmi<?> e() {
      return this.a;
   }

   public cls f() {
      return this.b;
   }
}
