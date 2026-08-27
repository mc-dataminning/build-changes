public class cvm extends cvl {
   private final ir b;

   public cvm(czu $$0, im $$1, ir $$2, csd $$3, ir $$4) {
      super($$0, null, bop.a, $$3, new etb(etf.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public im a() {
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
   public ir d() {
      return ir.a;
   }

   @Override
   public ir[] f() {
      switch (this.b) {
         case a:
         default:
            return new ir[]{ir.a, ir.c, ir.f, ir.d, ir.e, ir.b};
         case b:
            return new ir[]{ir.a, ir.b, ir.c, ir.f, ir.d, ir.e};
         case c:
            return new ir[]{ir.a, ir.c, ir.f, ir.e, ir.b, ir.d};
         case d:
            return new ir[]{ir.a, ir.d, ir.f, ir.e, ir.b, ir.c};
         case e:
            return new ir[]{ir.a, ir.e, ir.d, ir.b, ir.c, ir.f};
         case f:
            return new ir[]{ir.a, ir.f, ir.d, ir.b, ir.c, ir.e};
      }
   }

   @Override
   public ir g() {
      return this.b.o() == ir.a.b ? ir.c : this.b;
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
