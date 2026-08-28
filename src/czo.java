public class czo extends czn {
   private final jk b;

   public czo(dej $$0, jf $$1, jk $$2, cvs $$3, jk $$4) {
      super($$0, null, brr.a, $$3, new eys(eyw.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public jf a() {
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
   public jk d() {
      return jk.a;
   }

   @Override
   public jk[] f() {
      switch (this.b) {
         case a:
         default:
            return new jk[]{jk.a, jk.c, jk.f, jk.d, jk.e, jk.b};
         case b:
            return new jk[]{jk.a, jk.b, jk.c, jk.f, jk.d, jk.e};
         case c:
            return new jk[]{jk.a, jk.c, jk.f, jk.e, jk.b, jk.d};
         case d:
            return new jk[]{jk.a, jk.d, jk.f, jk.e, jk.b, jk.c};
         case e:
            return new jk[]{jk.a, jk.e, jk.d, jk.b, jk.c, jk.f};
         case f:
            return new jk[]{jk.a, jk.f, jk.d, jk.b, jk.c, jk.e};
      }
   }

   @Override
   public jk g() {
      return this.b.o() == jk.a.b ? jk.c : this.b;
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
