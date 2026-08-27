public class cns extends cnr {
   private final hx b;

   public cns(csa $$0, ht $$1, hx $$2, clj $$3, hx $$4) {
      super($$0, null, biw.a, $$3, new ejq(eju.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public ht a() {
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
   public hx d() {
      return hx.a;
   }

   @Override
   public hx[] f() {
      switch (this.b) {
         case a:
         default:
            return new hx[]{hx.a, hx.c, hx.f, hx.d, hx.e, hx.b};
         case b:
            return new hx[]{hx.a, hx.b, hx.c, hx.f, hx.d, hx.e};
         case c:
            return new hx[]{hx.a, hx.c, hx.f, hx.e, hx.b, hx.d};
         case d:
            return new hx[]{hx.a, hx.d, hx.f, hx.e, hx.b, hx.c};
         case e:
            return new hx[]{hx.a, hx.e, hx.d, hx.b, hx.c, hx.f};
         case f:
            return new hx[]{hx.a, hx.f, hx.d, hx.b, hx.c, hx.e};
      }
   }

   @Override
   public hx g() {
      return this.b.o() == hx.a.b ? hx.c : this.b;
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
