public class cwj extends cwi {
   private final is b;

   public cwj(dad $$0, in $$1, is $$2, csz $$3, is $$4) {
      super($$0, null, bpl.a, $$3, new etl(etp.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public in a() {
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
   public is d() {
      return is.a;
   }

   @Override
   public is[] f() {
      switch (this.b) {
         case a:
         default:
            return new is[]{is.a, is.c, is.f, is.d, is.e, is.b};
         case b:
            return new is[]{is.a, is.b, is.c, is.f, is.d, is.e};
         case c:
            return new is[]{is.a, is.c, is.f, is.e, is.b, is.d};
         case d:
            return new is[]{is.a, is.d, is.f, is.e, is.b, is.c};
         case e:
            return new is[]{is.a, is.e, is.d, is.b, is.c, is.f};
         case f:
            return new is[]{is.a, is.f, is.d, is.b, is.c, is.e};
      }
   }

   @Override
   public is g() {
      return this.b.o() == is.a.b ? is.c : this.b;
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
