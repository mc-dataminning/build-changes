public class cxo extends cxn {
   private final jf b;

   public cxo(dcg $$0, ja $$1, jf $$2, cud $$3, jf $$4) {
      super($$0, null, bqg.a, $$3, new ewd(ewh.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public ja a() {
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
   public jf d() {
      return jf.a;
   }

   @Override
   public jf[] f() {
      switch (this.b) {
         case a:
         default:
            return new jf[]{jf.a, jf.c, jf.f, jf.d, jf.e, jf.b};
         case b:
            return new jf[]{jf.a, jf.b, jf.c, jf.f, jf.d, jf.e};
         case c:
            return new jf[]{jf.a, jf.c, jf.f, jf.e, jf.b, jf.d};
         case d:
            return new jf[]{jf.a, jf.d, jf.f, jf.e, jf.b, jf.c};
         case e:
            return new jf[]{jf.a, jf.e, jf.d, jf.b, jf.c, jf.f};
         case f:
            return new jf[]{jf.a, jf.f, jf.d, jf.b, jf.c, jf.e};
      }
   }

   @Override
   public jf g() {
      return this.b.o() == jf.a.b ? jf.c : this.b;
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
