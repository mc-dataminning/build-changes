public class fpi extends fnw {
   private static final fpm a = new fpm(
      alp.b("widget/tab_selected"), alp.b("widget/tab"), alp.b("widget/tab_selected_highlighted"), alp.b("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fqd m;
   private final fqc n;

   public fpi(fqd $$0, fqc $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      $$0.a(glq::H, a.a(this.b(), this.B()), this.D(), this.E(), this.g, this.h);
      fnj $$4 = flz.Q().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.a($$0, this.D() + 2, this.E() + 2, this.F() - 2, this.G());
         this.b($$0, $$4, $$5);
      }
   }

   protected void a(fnl $$0, int $$1, int $$2, int $$3, int $$4) {
      ftr.a($$0, ftr.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(fnl $$0, fnj $$1, int $$2) {
      int $$3 = this.D() + 1;
      int $$4 = this.E() + (this.b() ? 0 : 3);
      int $$5 = this.D() + this.y() - 1;
      int $$6 = this.E() + this.w();
      a($$0, $$1, this.z(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(fnl $$0, fnj $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.z()), this.y() - 4);
      int $$4 = this.D() + (this.y() - $$3) / 2;
      int $$5 = this.E() + this.w() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(frw $$0) {
      $$0.a(frv.a, xk.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(hgj $$0) {
   }

   public fqc a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
