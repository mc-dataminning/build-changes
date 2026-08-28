public class dai extends dah {
   private final jn b;

   public dai(dgj $$0, ji $$1, jn $$2, cwq $$3, jn $$4) {
      super($$0, null, bsk.a, $$3, new fax(fbb.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public ji a() {
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
   public jn d() {
      return jn.a;
   }

   @Override
   public jn[] f() {
      switch (this.b) {
         case a:
         default:
            return new jn[]{jn.a, jn.c, jn.f, jn.d, jn.e, jn.b};
         case b:
            return new jn[]{jn.a, jn.b, jn.c, jn.f, jn.d, jn.e};
         case c:
            return new jn[]{jn.a, jn.c, jn.f, jn.e, jn.b, jn.d};
         case d:
            return new jn[]{jn.a, jn.d, jn.f, jn.e, jn.b, jn.c};
         case e:
            return new jn[]{jn.a, jn.e, jn.d, jn.b, jn.c, jn.f};
         case f:
            return new jn[]{jn.a, jn.f, jn.d, jn.b, jn.c, jn.e};
      }
   }

   @Override
   public jn g() {
      return this.b.o() == jn.a.b ? jn.c : this.b;
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
