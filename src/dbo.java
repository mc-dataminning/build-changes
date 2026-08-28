public class dbo extends dbn {
   private final jo b;

   public dbo(dhp $$0, jj $$1, jo $$2, cxy $$3, jo $$4) {
      super($$0, null, btp.a, $$3, new fcq(fcu.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public jj a() {
      return this.j().b();
   }

   @Override
   public boolean b() {
      return this.q().a_(this.j().b()).a(this);
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public jo d() {
      return jo.a;
   }

   @Override
   public jo[] f() {
      switch (this.b) {
         case a:
         default:
            return new jo[]{jo.a, jo.c, jo.f, jo.d, jo.e, jo.b};
         case b:
            return new jo[]{jo.a, jo.b, jo.c, jo.f, jo.d, jo.e};
         case c:
            return new jo[]{jo.a, jo.c, jo.f, jo.e, jo.b, jo.d};
         case d:
            return new jo[]{jo.a, jo.d, jo.f, jo.e, jo.b, jo.c};
         case e:
            return new jo[]{jo.a, jo.e, jo.d, jo.b, jo.c, jo.f};
         case f:
            return new jo[]{jo.a, jo.f, jo.d, jo.b, jo.c, jo.e};
      }
   }

   @Override
   public jo g() {
      return this.b.o() == jo.a.b ? jo.c : this.b;
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
