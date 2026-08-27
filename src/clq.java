public class clq extends clp {
   private final hc b;

   public clq(cpx $$0, gw $$1, hc $$2, cjh $$3, hc $$4) {
      super($$0, null, bgz.a, $$3, new ehl(ehp.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public gw a() {
      return this.j().a();
   }

   @Override
   public boolean b() {
      return this.q().a_(this.j().a()).a(this);
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public hc d() {
      return hc.a;
   }

   @Override
   public hc[] f() {
      switch (this.b) {
         case a:
         default:
            return new hc[]{hc.a, hc.c, hc.f, hc.d, hc.e, hc.b};
         case b:
            return new hc[]{hc.a, hc.b, hc.c, hc.f, hc.d, hc.e};
         case c:
            return new hc[]{hc.a, hc.c, hc.f, hc.e, hc.b, hc.d};
         case d:
            return new hc[]{hc.a, hc.d, hc.f, hc.e, hc.b, hc.c};
         case e:
            return new hc[]{hc.a, hc.e, hc.d, hc.b, hc.c, hc.f};
         case f:
            return new hc[]{hc.a, hc.f, hc.d, hc.b, hc.c, hc.e};
      }
   }

   @Override
   public hc g() {
      return this.b.o() == hc.a.b ? hc.c : this.b;
   }

   @Override
   public boolean h() {
      return false;
   }

   @Override
   public float i() {
      return (float)(this.b.e() * 90);
   }
}
