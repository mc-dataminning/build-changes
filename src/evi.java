public class evi extends eui {
   private static final int c = 24;

   public evi(euq $$0, enr $$1) {
      super($$0, $$1, sw.c("controls.title"));
   }

   @Override
   protected void b() {
      super.b();
      int $$0 = this.g / 2 - 155;
      int $$1 = $$0 + 160;
      int $$2 = this.h / 6 - 12;
      this.d(epi.a(sw.c("options.mouse_settings"), $$0x -> this.f.a(new euf(this, this.b))).a($$0, $$2, 150, 20).a());
      this.d(epi.a(sw.c("controls.keybinds"), $$0x -> this.f.a(new evk(this, this.b))).a($$1, $$2, 150, 20).a());
      $$2 += 24;
      this.d(this.b.X().a(this.b, $$0, $$2, 150));
      this.d(this.b.Y().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(this.b.D().a(this.b, $$0, $$2, 150));
      this.d(this.b.E().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(epi.a(sv.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, $$2, 200, 20).a());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }
}
