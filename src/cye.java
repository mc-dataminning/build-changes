public class cye extends cyd {
   private final iw b;

   public cye(dca $$0, ir $$1, iw $$2, cuh $$3, iw $$4) {
      super($$0, null, bpz.a, $$3, new ewq(ewu.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public ir a() {
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
   public iw d() {
      return iw.a;
   }

   @Override
   public iw[] f() {
      switch (this.b) {
         case a:
         default:
            return new iw[]{iw.a, iw.c, iw.f, iw.d, iw.e, iw.b};
         case b:
            return new iw[]{iw.a, iw.b, iw.c, iw.f, iw.d, iw.e};
         case c:
            return new iw[]{iw.a, iw.c, iw.f, iw.e, iw.b, iw.d};
         case d:
            return new iw[]{iw.a, iw.d, iw.f, iw.e, iw.b, iw.c};
         case e:
            return new iw[]{iw.a, iw.e, iw.d, iw.b, iw.c, iw.f};
         case f:
            return new iw[]{iw.a, iw.f, iw.d, iw.b, iw.c, iw.e};
      }
   }

   @Override
   public iw g() {
      return this.b.o() == iw.a.b ? iw.c : this.b;
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
