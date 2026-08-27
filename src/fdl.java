public class fdl extends fcl {
   private static final int c = 24;

   public fdl(fct $$0, eve $$1) {
      super($$0, $$1, vd.c("controls.title"));
   }

   @Override
   protected void aN_() {
      super.aN_();
      int $$0 = this.g / 2 - 155;
      int $$1 = $$0 + 160;
      int $$2 = this.h / 6 - 12;
      this.d(ewy.a(vd.c("options.mouse_settings"), $$0x -> this.f.a(new fch(this, this.b))).a($$0, $$2, 150, 20).a());
      this.d(ewy.a(vd.c("controls.keybinds"), $$0x -> this.f.a(new fdn(this, this.b))).a($$1, $$2, 150, 20).a());
      $$2 += 24;
      this.d(this.b.Z().a(this.b, $$0, $$2, 150));
      this.d(this.b.aa().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(this.b.F().a(this.b, $$0, $$2, 150));
      this.d(this.b.G().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(ewy.a(vc.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, $$2, 200, 20).a());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
