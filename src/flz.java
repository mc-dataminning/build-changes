public class flz extends fmy {
   private static final xl a = xl.c("gui.toMenu");
   private static final xl b = xl.c("gui.toTitle");
   private final fmy c;
   private final xl d;
   private final xl r;
   private final fkq s = fkq.d();

   public flz(fmy $$0, xl $$1, xl $$2) {
      this($$0, $$1, $$2, a);
   }

   public flz(fmy $$0, xl $$1, xl $$2, xl $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aN_() {
      this.s.c().b().a(10);
      this.s.a(new fig(this.l, this.p));
      this.s.a(new fht(this.d, this.p).d(this.n - 50).b(true));
      fgz $$0;
      if (this.m.F()) {
         $$0 = fgz.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = fgz.a(b, $$0x -> this.m.a(new fnd())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fkk.a(this.s, this.G());
   }

   @Override
   public xl i() {
      return xk.a(this.l, this.d);
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
