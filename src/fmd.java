public class fmd extends fnc {
   private static final xo a = xo.c("gui.toMenu");
   private static final xo b = xo.c("gui.toTitle");
   private final fnc c;
   private final xo d;
   private final xo r;
   private final fku s = fku.d();

   public fmd(fnc $$0, xo $$1, xo $$2) {
      this($$0, $$1, $$2, a);
   }

   public fmd(fnc $$0, xo $$1, xo $$2, xo $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fik(this.l, this.p));
      this.s.a(new fhx(this.d, this.p).d(this.n - 50).b(true));
      fhd $$0;
      if (this.m.F()) {
         $$0 = fhd.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = fhd.a(b, $$0x -> this.m.a(new fnh())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fko.a(this.s, this.G());
   }

   @Override
   public xo i() {
      return xn.a(this.l, this.d);
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
