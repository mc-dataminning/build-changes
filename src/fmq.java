public class fmq extends flf {
   private static final fmu a = new fmu(
      ali.b("widget/tab_selected"), ali.b("widget/tab"), ali.b("widget/tab_selected_highlighted"), ali.b("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fnl m;
   private final fnk n;

   public fmq(fnl $$0, fnk $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      $$0.a(gir::B, a.a(this.b(), this.B()), this.D(), this.E(), this.g, this.h);
      fks $$4 = fji.Q().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.a($$0, this.D() + 2, this.E() + 2, this.F() - 2, this.G());
         this.b($$0, $$4, $$5);
      }
   }

   protected void a(fku $$0, int $$1, int $$2, int $$3, int $$4) {
      fra.a($$0, fra.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(fku $$0, fks $$1, int $$2) {
      int $$3 = this.D() + 1;
      int $$4 = this.E() + (this.b() ? 0 : 3);
      int $$5 = this.D() + this.y() - 1;
      int $$6 = this.E() + this.w();
      a($$0, $$1, this.z(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(fku $$0, fks $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.z()), this.y() - 4);
      int $$4 = this.D() + (this.y() - $$3) / 2;
      int $$5 = this.E() + this.w() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(fpf $$0) {
      $$0.a(fpe.a, xi.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(hdf $$0) {
   }

   public fnk a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
