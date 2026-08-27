public class fnn extends fon {
   private static final xe a = xe.c("gui.toMenu");
   private static final xe b = xe.c("gui.toTitle");
   private final fon c;
   private final xe d;
   private final xe r;
   private final fme s = fme.d();

   public fnn(fon $$0, xe $$1, xe $$2) {
      this($$0, $$1, $$2, a);
   }

   public fnn(fon $$0, xe $$1, xe $$2, xe $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aN_() {
      this.s.c().b().a(10);
      this.s.a(new fju(this.l, this.p));
      this.s.a(new fjh(this.d, this.p).d(this.n - 50).b(true));
      fin $$0;
      if (this.m.F()) {
         $$0 = fin.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = fin.a(b, $$0x -> this.m.a(new fou())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fly.a(this.s, this.G());
   }

   @Override
   public xe i() {
      return xd.a(this.l, this.d);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
