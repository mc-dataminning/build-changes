public class fmg extends fnf {
   private static final xp a = xp.c("gui.toMenu");
   private static final xp b = xp.c("gui.toTitle");
   private final fnf c;
   private final xp d;
   private final xp r;
   private final fkx s = fkx.d();

   public fmg(fnf $$0, xp $$1, xp $$2) {
      this($$0, $$1, $$2, a);
   }

   public fmg(fnf $$0, xp $$1, xp $$2, xp $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fin(this.l, this.p));
      this.s.a(new fia(this.d, this.p).d(this.n - 50).b(true));
      fhg $$0;
      if (this.m.F()) {
         $$0 = fhg.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = fhg.a(b, $$0x -> this.m.a(new fnk())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fkr.a(this.s, this.G());
   }

   @Override
   public xp i() {
      return xo.a(this.l, this.d);
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
