import com.mojang.blaze3d.systems.RenderSystem;

public class fin extends fhc {
   private static final fir a = new fir(
      new alf("widget/tab_selected"), new alf("widget/tab"), new alf("widget/tab_selected_highlighted"), new alf("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fjh m;
   private final fjg n;

   public fin(fjh $$0, fjg $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(a.a(this.b(), this.A()), this.C(), this.D(), this.g, this.h);
      RenderSystem.disableBlend();
      fgp $$4 = fff.Q().h;
      int $$5 = this.j ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.b()) {
         this.a($$0, this.C() + 2, this.D() + 2, this.E() - 2, this.F());
         this.b($$0, $$4, $$5);
      }
   }

   protected void a(fgr $$0, int $$1, int $$2, int $$3, int $$4) {
      fnd.a($$0, fnd.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(fgr $$0, fgp $$1, int $$2) {
      int $$3 = this.C() + 1;
      int $$4 = this.D() + (this.b() ? 0 : 3);
      int $$5 = this.C() + this.x() - 1;
      int $$6 = this.D() + this.v();
      a($$0, $$1, this.y(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(fgr $$0, fgp $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.y()), this.x() - 4);
      int $$4 = this.C() + (this.x() - $$3) / 2;
      int $$5 = this.D() + this.v() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(fla $$0) {
      $$0.a(fkz.a, xp.a("gui.narrate.tab", this.n.a()));
   }

   @Override
   public void a(gtv $$0) {
   }

   public fjg a() {
      return this.n;
   }

   public boolean b() {
      return this.m.a() == this.n;
   }
}
