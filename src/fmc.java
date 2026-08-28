public class fmc extends fnb {
   private static final xo a = xo.c("gui.toMenu");
   private static final xo b = xo.c("gui.toTitle");
   private final fnb c;
   private final xo d;
   private final xo r;
   private final fkt s = fkt.d();

   public fmc(fnb $$0, xo $$1, xo $$2) {
      this($$0, $$1, $$2, a);
   }

   public fmc(fnb $$0, xo $$1, xo $$2, xo $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fij(this.l, this.p));
      this.s.a(new fhw(this.d, this.p).d(this.n - 50).b(true));
      fhc $$0;
      if (this.m.F()) {
         $$0 = fhc.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = fhc.a(b, $$0x -> this.m.a(new fng())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fkn.a(this.s, this.G());
   }

   @Override
   public xo i() {
      return xn.a(this.l, this.d);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
