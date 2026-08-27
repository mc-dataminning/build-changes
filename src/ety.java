public class ety extends eso {
   private static final euc a = new euc(
      new aex("widget/tab_selected"), new aex("widget/tab"), new aex("widget/tab_selected_highlighted"), new aex("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int l = 2;
   private final eur m;
   private final euq n;

   public ety(eur $$0, euq $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      $$0.a(a.a(this.b(), this.n()), this.r(), this.t(), this.f, this.g);
      esd $$4 = eqv.O().h;
      int $$5 = this.i ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(esf $$0, esd $$1, int $$2) {
      int $$3 = this.r() + 1;
      int $$4 = this.t() + (this.b() ? 0 : 3);
      int $$5 = this.r() + this.l() - 1;
      int $$6 = this.t() + this.i();
      a($$0, $$1, this.m(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(esf $$0, esd $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.m()), this.l() - 4);
      int $$4 = this.r() + (this.l() - $$3) / 2;
      int $$5 = this.t() + this.i() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(ewi $$0) {
      $$0.a(ewh.a, tm.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(gdq $$0) {
   }

   public euq a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
