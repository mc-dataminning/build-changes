public class ddu extends ddt {
   private final jc b;

   public ddu(djz $$0, iw $$1, jc $$2, daa $$3, jc $$4) {
      super($$0, null, bus.a, $$3, new ffo(ffs.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public iw a() {
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
   public jc d() {
      return jc.a;
   }

   @Override
   public jc[] f() {
      switch (this.b) {
         case a:
         default:
            return new jc[]{jc.a, jc.c, jc.f, jc.d, jc.e, jc.b};
         case b:
            return new jc[]{jc.a, jc.b, jc.c, jc.f, jc.d, jc.e};
         case c:
            return new jc[]{jc.a, jc.c, jc.f, jc.e, jc.b, jc.d};
         case d:
            return new jc[]{jc.a, jc.d, jc.f, jc.e, jc.b, jc.c};
         case e:
            return new jc[]{jc.a, jc.e, jc.d, jc.b, jc.c, jc.f};
         case f:
            return new jc[]{jc.a, jc.f, jc.d, jc.b, jc.c, jc.e};
      }
   }

   @Override
   public jc g() {
      return this.b.o() == jc.a.b ? jc.c : this.b;
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
