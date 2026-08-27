public class crh extends crg {
   private final ie b;

   public crh(cvn $$0, hz $$1, ie $$2, coz $$3, ie $$4) {
      super($$0, null, blt.a, $$3, new eno(ens.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public hz a() {
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
   public ie d() {
      return ie.a;
   }

   @Override
   public ie[] f() {
      switch (this.b) {
         case a:
         default:
            return new ie[]{ie.a, ie.c, ie.f, ie.d, ie.e, ie.b};
         case b:
            return new ie[]{ie.a, ie.b, ie.c, ie.f, ie.d, ie.e};
         case c:
            return new ie[]{ie.a, ie.c, ie.f, ie.e, ie.b, ie.d};
         case d:
            return new ie[]{ie.a, ie.d, ie.f, ie.e, ie.b, ie.c};
         case e:
            return new ie[]{ie.a, ie.e, ie.d, ie.b, ie.c, ie.f};
         case f:
            return new ie[]{ie.a, ie.f, ie.d, ie.b, ie.c, ie.e};
      }
   }

   @Override
   public ie g() {
      return this.b.o() == ie.a.b ? ie.c : this.b;
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
