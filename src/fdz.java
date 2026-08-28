public class fdz extends gwo {
   private final fob a;
   private final fdz.a b;
   private fjd c = fjd.a;

   public fdz(fdh $$0, fob $$1) {
      super(fge.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdz(wz $$0, fob $$1) {
      super(fge.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdz(wz $$0, wz $$1, fob $$2) {
      super(fge.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fdz.a a(fdh $$0) {
      fby $$1 = $$0.a;
      return a(wz.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fdz.a a(wz $$0) {
      return a(wz.c("mco.errorMessage.generic"), $$0);
   }

   private static fdz.a a(wz $$0, wz $$1) {
      return new fdz.a($$0, $$1);
   }

   @Override
   public void aT_() {
      this.c(fik.a(wy.h, $$0 -> this.d()).a(this.m / 2 - 100, this.n - 52, 200, 20).a());
      this.c = fjd.a(this.o, this.b.b, this.m * 3 / 4);
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   @Override
   public wz i() {
      return wz.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b.a, this.m / 2, 80, -1);
      this.c.a($$0, this.m / 2, 100, 9, -2142128);
   }

   static record a(wz a, wz b) {
   }
}
