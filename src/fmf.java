public class fmf extends fne {
   private static final xp a = xp.c("gui.toMenu");
   private static final xp b = xp.c("gui.toTitle");
   private final fne c;
   private final xp d;
   private final xp r;
   private final fkw s = fkw.d();

   public fmf(fne $$0, xp $$1, xp $$2) {
      this($$0, $$1, $$2, a);
   }

   public fmf(fne $$0, xp $$1, xp $$2, xp $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fim(this.l, this.p));
      this.s.a(new fhz(this.d, this.p).d(this.n - 50).b(true));
      fhf $$0;
      if (this.m.F()) {
         $$0 = fhf.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = fhf.a(b, $$0x -> this.m.a(new fnj())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fkq.a(this.s, this.G());
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
