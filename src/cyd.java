public class cyd extends cyc {
   private final je b;

   public cyd(dca $$0, iz $$1, je $$2, cur $$3, je $$4) {
      super($$0, null, bqv.a, $$3, new evp(evt.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public iz a() {
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
   public je d() {
      return je.a;
   }

   @Override
   public je[] f() {
      switch (this.b) {
         case a:
         default:
            return new je[]{je.a, je.c, je.f, je.d, je.e, je.b};
         case b:
            return new je[]{je.a, je.b, je.c, je.f, je.d, je.e};
         case c:
            return new je[]{je.a, je.c, je.f, je.e, je.b, je.d};
         case d:
            return new je[]{je.a, je.d, je.f, je.e, je.b, je.c};
         case e:
            return new je[]{je.a, je.e, je.d, je.b, je.c, je.f};
         case f:
            return new je[]{je.a, je.f, je.d, je.b, je.c, je.e};
      }
   }

   @Override
   public je g() {
      return this.b.o() == je.a.b ? je.c : this.b;
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
