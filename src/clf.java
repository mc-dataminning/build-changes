public class clf extends cle {
   private final hb b;

   public clf(cpk $$0, gv $$1, hb $$2, ciw $$3, hb $$4) {
      super($$0, null, bgn.a, $$3, new ehb(ehf.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public gv a() {
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
   public hb d() {
      return hb.a;
   }

   @Override
   public hb[] f() {
      switch (this.b) {
         case a:
         default:
            return new hb[]{hb.a, hb.c, hb.f, hb.d, hb.e, hb.b};
         case b:
            return new hb[]{hb.a, hb.b, hb.c, hb.f, hb.d, hb.e};
         case c:
            return new hb[]{hb.a, hb.c, hb.f, hb.e, hb.b, hb.d};
         case d:
            return new hb[]{hb.a, hb.d, hb.f, hb.e, hb.b, hb.c};
         case e:
            return new hb[]{hb.a, hb.e, hb.d, hb.b, hb.c, hb.f};
         case f:
            return new hb[]{hb.a, hb.f, hb.d, hb.b, hb.c, hb.e};
      }
   }

   @Override
   public hb g() {
      return this.b.o() == hb.a.b ? hb.c : this.b;
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
