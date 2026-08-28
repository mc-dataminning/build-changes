public class dbh extends dbg {
   private final jm b;

   public dbh(dhi $$0, jh $$1, jm $$2, cxp $$3, jm $$4) {
      super($$0, null, bti.a, $$3, new fbu(fby.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public jh a() {
      return this.j().b();
   }

   @Override
   public boolean b() {
      return this.q().a_(this.j().b()).a(this);
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public jm d() {
      return jm.a;
   }

   @Override
   public jm[] f() {
      switch (this.b) {
         case a:
         default:
            return new jm[]{jm.a, jm.c, jm.f, jm.d, jm.e, jm.b};
         case b:
            return new jm[]{jm.a, jm.b, jm.c, jm.f, jm.d, jm.e};
         case c:
            return new jm[]{jm.a, jm.c, jm.f, jm.e, jm.b, jm.d};
         case d:
            return new jm[]{jm.a, jm.d, jm.f, jm.e, jm.b, jm.c};
         case e:
            return new jm[]{jm.a, jm.e, jm.d, jm.b, jm.c, jm.f};
         case f:
            return new jm[]{jm.a, jm.f, jm.d, jm.b, jm.c, jm.e};
      }
   }

   @Override
   public jm g() {
      return this.b.o() == jm.a.b ? jm.c : this.b;
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
