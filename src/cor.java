public class cor extends coq {
   private final ia b;

   public cor(csy $$0, hv $$1, ia $$2, cmh $$3, ia $$4) {
      super($$0, null, bjk.a, $$3, new ekx(elb.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public hv a() {
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
   public ia d() {
      return ia.a;
   }

   @Override
   public ia[] f() {
      switch (this.b) {
         case a:
         default:
            return new ia[]{ia.a, ia.c, ia.f, ia.d, ia.e, ia.b};
         case b:
            return new ia[]{ia.a, ia.b, ia.c, ia.f, ia.d, ia.e};
         case c:
            return new ia[]{ia.a, ia.c, ia.f, ia.e, ia.b, ia.d};
         case d:
            return new ia[]{ia.a, ia.d, ia.f, ia.e, ia.b, ia.c};
         case e:
            return new ia[]{ia.a, ia.e, ia.d, ia.b, ia.c, ia.f};
         case f:
            return new ia[]{ia.a, ia.f, ia.d, ia.b, ia.c, ia.e};
      }
   }

   @Override
   public ia g() {
      return this.b.o() == ia.a.b ? ia.c : this.b;
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
