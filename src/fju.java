public class fju extends fkt {
   private static final ws a = ws.c("gui.toMenu");
   private static final ws b = ws.c("gui.toTitle");
   private final fkt c;
   private final ws d;
   private final ws r;
   private final fil s = fil.d();

   public fju(fkt $$0, ws $$1, ws $$2) {
      this($$0, $$1, $$2, a);
   }

   public fju(fkt $$0, ws $$1, ws $$2, ws $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fgb(this.l, this.p));
      this.s.a(new ffo(this.d, this.p).d(this.n - 50).b(true));
      feu $$0;
      if (this.m.F()) {
         $$0 = feu.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = feu.a(b, $$0x -> this.m.a(new fky())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fif.a(this.s, this.G());
   }

   @Override
   public ws i() {
      return wr.a(this.l, this.d);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
