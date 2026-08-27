public class eto extends ese {
   private static final ets a = new ets(
      new aer("widget/tab_selected"), new aer("widget/tab"), new aer("widget/tab_selected_highlighted"), new aer("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int l = 2;
   private final euh m;
   private final eug n;

   public eto(euh $$0, eug $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      $$0.a(a.a(this.b(), this.n()), this.r(), this.t(), this.f, this.g);
      ert $$4 = eql.O().h;
      int $$5 = this.i ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(erv $$0, ert $$1, int $$2) {
      int $$3 = this.r() + 1;
      int $$4 = this.t() + (this.b() ? 0 : 3);
      int $$5 = this.r() + this.l() - 1;
      int $$6 = this.t() + this.i();
      a($$0, $$1, this.m(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(erv $$0, ert $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.m()), this.l() - 4);
      int $$4 = this.r() + (this.l() - $$3) / 2;
      int $$5 = this.t() + this.i() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(evy $$0) {
      $$0.a(evx.a, tf.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(gdg $$0) {
   }

   public eug a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
