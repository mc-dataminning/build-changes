public class fhz extends fgz {
   private static final int c = 24;

   public fhz(fhh $$0, ezm $$1) {
      super($$0, $$1, vu.c("controls.title"));
   }

   @Override
   protected void aO_() {
      super.aO_();
      int $$0 = this.g / 2 - 155;
      int $$1 = $$0 + 160;
      int $$2 = this.h / 6 - 12;
      this.c(fbi.a(vu.c("options.mouse_settings"), $$0x -> this.f.a(new fgv(this, this.b))).a($$0, $$2, 150, 20).a());
      this.c(fbi.a(vu.c("controls.keybinds"), $$0x -> this.f.a(new fib(this, this.b))).a($$1, $$2, 150, 20).a());
      $$2 += 24;
      this.c(this.b.aa().a(this.b, $$0, $$2, 150));
      this.c(this.b.ab().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.c(this.b.F().a(this.b, $$0, $$2, 150));
      this.c(this.b.G().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.c(fbi.a(vt.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, $$2, 200, 20).a());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
