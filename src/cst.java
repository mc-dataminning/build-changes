public class cst extends css {
   private final ih b;

   public cst(cwz $$0, ib $$1, ih $$2, cqk $$3, ih $$4) {
      super($$0, null, bnb.a, $$3, new epn(epr.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public ib a() {
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
   public ih d() {
      return ih.a;
   }

   @Override
   public ih[] f() {
      switch (this.b) {
         case a:
         default:
            return new ih[]{ih.a, ih.c, ih.f, ih.d, ih.e, ih.b};
         case b:
            return new ih[]{ih.a, ih.b, ih.c, ih.f, ih.d, ih.e};
         case c:
            return new ih[]{ih.a, ih.c, ih.f, ih.e, ih.b, ih.d};
         case d:
            return new ih[]{ih.a, ih.d, ih.f, ih.e, ih.b, ih.c};
         case e:
            return new ih[]{ih.a, ih.e, ih.d, ih.b, ih.c, ih.f};
         case f:
            return new ih[]{ih.a, ih.f, ih.d, ih.b, ih.c, ih.e};
      }
   }

   @Override
   public ih g() {
      return this.b.o() == ih.a.b ? ih.c : this.b;
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
