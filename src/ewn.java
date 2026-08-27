public class ewn extends evc {
   private static final ewr a = new ewr(
      new agm("widget/tab_selected"), new agm("widget/tab"), new agm("widget/tab_selected_highlighted"), new agm("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int l = 2;
   private final exg m;
   private final exf n;

   public ewn(exg $$0, exf $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      $$0.a(a.a(this.b(), this.m()), this.p(), this.r(), this.f, this.g);
      eur $$4 = eti.N().h;
      int $$5 = this.i ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(eut $$0, eur $$1, int $$2) {
      int $$3 = this.p() + 1;
      int $$4 = this.r() + (this.b() ? 0 : 3);
      int $$5 = this.p() + this.k() - 1;
      int $$6 = this.r() + this.i();
      a($$0, $$1, this.l(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(eut $$0, eur $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.l()), this.k() - 4);
      int $$4 = this.p() + (this.k() - $$3) / 2;
      int $$5 = this.r() + this.i() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(eyx $$0) {
      $$0.a(eyw.a, uv.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(ggl $$0) {
   }

   public exf a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
