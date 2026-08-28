public class cyc extends cyb {
   private final ji b;

   public cyc(dcu $$0, jd $$1, ji $$2, cuo $$3, ji $$4) {
      super($$0, null, bqp.a, $$3, new ews(eww.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public jd a() {
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
   public ji d() {
      return ji.a;
   }

   @Override
   public ji[] f() {
      switch (this.b) {
         case a:
         default:
            return new ji[]{ji.a, ji.c, ji.f, ji.d, ji.e, ji.b};
         case b:
            return new ji[]{ji.a, ji.b, ji.c, ji.f, ji.d, ji.e};
         case c:
            return new ji[]{ji.a, ji.c, ji.f, ji.e, ji.b, ji.d};
         case d:
            return new ji[]{ji.a, ji.d, ji.f, ji.e, ji.b, ji.c};
         case e:
            return new ji[]{ji.a, ji.e, ji.d, ji.b, ji.c, ji.f};
         case f:
            return new ji[]{ji.a, ji.f, ji.d, ji.b, ji.c, ji.e};
      }
   }

   @Override
   public ji g() {
      return this.b.o() == ji.a.b ? ji.c : this.b;
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
