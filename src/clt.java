public abstract class clt implements cml<bgt> {
   protected final cmp<?> a;
   protected final clz b;
   protected final String c;
   protected final cmi d;
   protected final cjh e;
   protected final float f;
   protected final int g;

   public clt(cmp<?> $$0, String $$1, clz $$2, cmi $$3, cjh $$4, float $$5, int $$6) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public boolean a(bgt $$0, cpx $$1) {
      return this.d.a($$0.a(0));
   }

   @Override
   public cjh a(bgt $$0, hu $$1) {
      return this.e.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public hp<cmi> a() {
      hp<cmi> $$0 = hp.a();
      $$0.add(this.d);
      return $$0;
   }

   public float b() {
      return this.f;
   }

   @Override
   public cjh a(hu $$0) {
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
   public cmp<?> e() {
      return this.a;
   }

   public clz f() {
      return this.b;
   }
}
