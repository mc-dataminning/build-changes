public class cpq extends cpp {
   private final ic b;

   public cpq(ctx $$0, hx $$1, ic $$2, cng $$3, ic $$4) {
      super($$0, null, bkb.a, $$3, new ely(emc.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public hx a() {
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
   public ic d() {
      return ic.a;
   }

   @Override
   public ic[] f() {
      switch (this.b) {
         case a:
         default:
            return new ic[]{ic.a, ic.c, ic.f, ic.d, ic.e, ic.b};
         case b:
            return new ic[]{ic.a, ic.b, ic.c, ic.f, ic.d, ic.e};
         case c:
            return new ic[]{ic.a, ic.c, ic.f, ic.e, ic.b, ic.d};
         case d:
            return new ic[]{ic.a, ic.d, ic.f, ic.e, ic.b, ic.c};
         case e:
            return new ic[]{ic.a, ic.e, ic.d, ic.b, ic.c, ic.f};
         case f:
            return new ic[]{ic.a, ic.f, ic.d, ic.b, ic.c, ic.e};
      }
   }

   @Override
   public ic g() {
      return this.b.o() == ic.a.b ? ic.c : this.b;
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
