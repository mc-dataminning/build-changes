public class cxc extends cxb {
   private final it b;

   public cxc(daz $$0, io $$1, it $$2, ctq $$3, it $$4) {
      super($$0, null, bpv.a, $$3, new eui(eum.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public io a() {
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
   public it d() {
      return it.a;
   }

   @Override
   public it[] f() {
      switch (this.b) {
         case a:
         default:
            return new it[]{it.a, it.c, it.f, it.d, it.e, it.b};
         case b:
            return new it[]{it.a, it.b, it.c, it.f, it.d, it.e};
         case c:
            return new it[]{it.a, it.c, it.f, it.e, it.b, it.d};
         case d:
            return new it[]{it.a, it.d, it.f, it.e, it.b, it.c};
         case e:
            return new it[]{it.a, it.e, it.d, it.b, it.c, it.f};
         case f:
            return new it[]{it.a, it.f, it.d, it.b, it.c, it.e};
      }
   }

   @Override
   public it g() {
      return this.b.o() == it.a.b ? it.c : this.b;
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
