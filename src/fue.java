public class fue extends fst {
   private static final fui a = new fui(
      alg.b("widget/tab_selected"), alg.b("widget/tab"), alg.b("widget/tab_selected_highlighted"), alg.b("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fuz m;
   private final fuy n;

   public fue(fuz $$0, fuy $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      $$0.a(gqx::H, a.a(this.b(), this.D()), this.F(), this.G(), this.g, this.h);
      fsf $$4 = fpo.Q().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.a($$0, this.F() + 2, this.G() + 2, this.H() - 2, this.I());
         this.b($$0, $$4, $$5);
      }
   }

   protected void a(fsh $$0, int $$1, int $$2, int $$3, int $$4) {
      fyn.a($$0, fyn.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(fsh $$0, fsf $$1, int $$2) {
      int $$3 = this.F() + 1;
      int $$4 = this.G() + (this.b() ? 0 : 3);
      int $$5 = this.F() + this.A() - 1;
      int $$6 = this.G() + this.y();
      a($$0, $$1, this.B(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(fsh $$0, fsf $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.B()), this.A() - 4);
      int $$4 = this.F() + (this.A() - $$3) / 2;
      int $$5 = this.G() + this.y() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(fws $$0) {
      $$0.a(fwr.a, wy.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(hon $$0) {
   }

   public fuy a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
