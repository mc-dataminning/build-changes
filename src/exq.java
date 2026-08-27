public class exq extends ewf {
   private static final exu a = new exu(
      new agt("widget/tab_selected"), new agt("widget/tab"), new agt("widget/tab_selected_highlighted"), new agt("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int l = 2;
   private final eyj m;
   private final eyi n;

   public exq(eyj $$0, eyi $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      $$0.a(a.a(this.b(), this.m()), this.p(), this.r(), this.f, this.g);
      evu $$4 = euk.N().h;
      int $$5 = this.i ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(evw $$0, evu $$1, int $$2) {
      int $$3 = this.p() + 1;
      int $$4 = this.r() + (this.b() ? 0 : 3);
      int $$5 = this.p() + this.k() - 1;
      int $$6 = this.r() + this.i();
      a($$0, $$1, this.l(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(evw $$0, evu $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.l()), this.k() - 4);
      int $$4 = this.p() + (this.k() - $$3) / 2;
      int $$5 = this.r() + this.i() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(faa $$0) {
      $$0.a(ezz.a, vb.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(gia $$0) {
   }

   public eyi a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
