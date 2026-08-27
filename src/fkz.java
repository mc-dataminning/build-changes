public class fkz extends fly {
   private static final wx a = wx.c("gui.toMenu");
   private static final wx b = wx.c("gui.toTitle");
   private final fly c;
   private final wx d;
   private final wx r;
   private final fjq s = fjq.d();

   public fkz(fly $$0, wx $$1, wx $$2) {
      this($$0, $$1, $$2, a);
   }

   public fkz(fly $$0, wx $$1, wx $$2, wx $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fhg(this.l, this.p));
      this.s.a(new fgt(this.d, this.p).d(this.n - 50).b(true));
      ffz $$0;
      if (this.m.F()) {
         $$0 = ffz.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = ffz.a(b, $$0x -> this.m.a(new fmd())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fjk.a(this.s, this.G());
   }

   @Override
   public wx i() {
      return ww.a(this.l, this.d);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
