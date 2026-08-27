public class eza extends exp {
   private static final eze a = new eze(
      new ahh("widget/tab_selected"), new ahh("widget/tab"), new ahh("widget/tab_selected_highlighted"), new ahh("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final ezt m;
   private final ezs n;

   public eza(ezt $$0, ezs $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      $$0.a(a.a(this.b(), this.y()), this.B(), this.C(), this.g, this.h);
      exc $$4 = evr.O().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(exe $$0, exc $$1, int $$2) {
      int $$3 = this.B() + 1;
      int $$4 = this.C() + (this.b() ? 0 : 3);
      int $$5 = this.B() + this.w() - 1;
      int $$6 = this.C() + this.u();
      a($$0, $$1, this.x(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(exe $$0, exc $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.x()), this.w() - 4);
      int $$4 = this.B() + (this.w() - $$3) / 2;
      int $$5 = this.C() + this.u() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(fbk $$0) {
      $$0.a(fbj.a, vg.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(gjs $$0) {
   }

   public ezs a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
