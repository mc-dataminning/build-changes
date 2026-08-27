public class eyw extends exx {
   private static final int c = 24;

   public eyw(eye $$0, eqt $$1) {
      super($$0, $$1, tl.c("controls.title"));
   }

   @Override
   protected void aH_() {
      super.aH_();
      int $$0 = this.g / 2 - 155;
      int $$1 = $$0 + 160;
      int $$2 = this.h / 6 - 12;
      this.d(esk.a(tl.c("options.mouse_settings"), $$0x -> this.f.a(new ext(this, this.b))).a($$0, $$2, 150, 20).a());
      this.d(esk.a(tl.c("controls.keybinds"), $$0x -> this.f.a(new eyy(this, this.b))).a($$1, $$2, 150, 20).a());
      $$2 += 24;
      this.d(this.b.Y().a(this.b, $$0, $$2, 150));
      this.d(this.b.Z().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(this.b.E().a(this.b, $$0, $$2, 150));
      this.d(this.b.F().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(esk.a(tk.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, $$2, 200, 20).a());
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
