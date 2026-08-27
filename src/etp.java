public class etp extends esg {
   private static final ett a = new ett(
      new aep("widget/tab_selected"), new aep("widget/tab"), new aep("widget/tab_selected_highlighted"), new aep("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int l = 2;
   private final eud m;
   private final euc n;

   public etp(eud $$0, euc $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      $$0.a(a.a(this.b(), this.m()), this.p(), this.r(), this.f, this.g);
      erv $$4 = eqn.N().h;
      int $$5 = this.i ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(erx $$0, erv $$1, int $$2) {
      int $$3 = this.p() + 1;
      int $$4 = this.r() + (this.b() ? 0 : 3);
      int $$5 = this.p() + this.k() - 1;
      int $$6 = this.r() + this.h();
      a($$0, $$1, this.l(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(erx $$0, erv $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.l()), this.k() - 4);
      int $$4 = this.p() + (this.k() - $$3) / 2;
      int $$5 = this.r() + this.h() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(evt $$0) {
      $$0.a(evs.a, te.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(gcs $$0) {
   }

   public euc a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
