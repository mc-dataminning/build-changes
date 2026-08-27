public class cnx extends cnw {
   private final ib b;

   public cnx(csf $$0, hx $$1, ib $$2, clo $$3, ib $$4) {
      super($$0, null, bja.a, $$3, new ejv(ejz.c($$1), $$4, $$1, false));
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
   public ib d() {
      return ib.a;
   }

   @Override
   public ib[] f() {
      switch (this.b) {
         case a:
         default:
            return new ib[]{ib.a, ib.c, ib.f, ib.d, ib.e, ib.b};
         case b:
            return new ib[]{ib.a, ib.b, ib.c, ib.f, ib.d, ib.e};
         case c:
            return new ib[]{ib.a, ib.c, ib.f, ib.e, ib.b, ib.d};
         case d:
            return new ib[]{ib.a, ib.d, ib.f, ib.e, ib.b, ib.c};
         case e:
            return new ib[]{ib.a, ib.e, ib.d, ib.b, ib.c, ib.f};
         case f:
            return new ib[]{ib.a, ib.f, ib.d, ib.b, ib.c, ib.e};
      }
   }

   @Override
   public ib g() {
      return this.b.o() == ib.a.b ? ib.c : this.b;
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
