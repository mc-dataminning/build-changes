public class cuy extends cux {
   private final ij b;

   public cuy(czg $$0, id $$1, ij $$2, crs $$3, ij $$4) {
      super($$0, null, boe.a, $$3, new esf(esj.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public id a() {
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
   public ij d() {
      return ij.a;
   }

   @Override
   public ij[] f() {
      switch (this.b) {
         case a:
         default:
            return new ij[]{ij.a, ij.c, ij.f, ij.d, ij.e, ij.b};
         case b:
            return new ij[]{ij.a, ij.b, ij.c, ij.f, ij.d, ij.e};
         case c:
            return new ij[]{ij.a, ij.c, ij.f, ij.e, ij.b, ij.d};
         case d:
            return new ij[]{ij.a, ij.d, ij.f, ij.e, ij.b, ij.c};
         case e:
            return new ij[]{ij.a, ij.e, ij.d, ij.b, ij.c, ij.f};
         case f:
            return new ij[]{ij.a, ij.f, ij.d, ij.b, ij.c, ij.e};
      }
   }

   @Override
   public ij g() {
      return this.b.o() == ij.a.b ? ij.c : this.b;
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
