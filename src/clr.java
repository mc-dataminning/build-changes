public abstract class clr implements cmj<bgr> {
   protected final cmn<?> a;
   protected final clx b;
   protected final String c;
   protected final cmg d;
   protected final cjf e;
   protected final float f;
   protected final int g;

   public clr(cmn<?> $$0, String $$1, clx $$2, cmg $$3, cjf $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bgr $$0, cpv $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cjf a(bgr $$0, hu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hp<cmg> a() {
      hp<cmg> $$0 = hp.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cjf a(hu $$0) {
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
   public cmn<?> e() {
      return this.a;
   }

   public clx f() {
      return this.b;
   }
}
