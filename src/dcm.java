public class dcm extends dcl {
   private final ja b;

   public dcm(dip $$0, iu $$1, ja $$2, cys $$3, ja $$4) {
      super($$0, null, btx.a, $$3, new fds(fdw.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public iu a() {
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
   public ja d() {
      return ja.a;
   }

   @Override
   public ja[] f() {
      switch (this.b) {
         case a:
         default:
            return new ja[]{ja.a, ja.c, ja.f, ja.d, ja.e, ja.b};
         case b:
            return new ja[]{ja.a, ja.b, ja.c, ja.f, ja.d, ja.e};
         case c:
            return new ja[]{ja.a, ja.c, ja.f, ja.e, ja.b, ja.d};
         case d:
            return new ja[]{ja.a, ja.d, ja.f, ja.e, ja.b, ja.c};
         case e:
            return new ja[]{ja.a, ja.e, ja.d, ja.b, ja.c, ja.f};
         case f:
            return new ja[]{ja.a, ja.f, ja.d, ja.b, ja.c, ja.e};
      }
   }

   @Override
   public ja g() {
      return this.b.o() == ja.a.b ? ja.c : this.b;
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
