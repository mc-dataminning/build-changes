public class cyx extends cyw {
   private final jj b;

   public cyx(dds $$0, je $$1, jj $$2, cvl $$3, jj $$4) {
      super($$0, null, brj.a, $$3, new eya(eye.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public je a() {
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
   public jj d() {
      return jj.a;
   }

   @Override
   public jj[] f() {
      switch (this.b) {
         case a:
         default:
            return new jj[]{jj.a, jj.c, jj.f, jj.d, jj.e, jj.b};
         case b:
            return new jj[]{jj.a, jj.b, jj.c, jj.f, jj.d, jj.e};
         case c:
            return new jj[]{jj.a, jj.c, jj.f, jj.e, jj.b, jj.d};
         case d:
            return new jj[]{jj.a, jj.d, jj.f, jj.e, jj.b, jj.c};
         case e:
            return new jj[]{jj.a, jj.e, jj.d, jj.b, jj.c, jj.f};
         case f:
            return new jj[]{jj.a, jj.f, jj.d, jj.b, jj.c, jj.e};
      }
   }

   @Override
   public jj g() {
      return this.b.o() == jj.a.b ? jj.c : this.b;
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
