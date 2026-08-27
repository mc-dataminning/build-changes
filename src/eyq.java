public class eyq extends exr {
   private static final int c = 24;

   public eyq(exz $$0, eqq $$1) {
      super($$0, $$1, tf.c("controls.title"));
   }

   @Override
   protected void aE_() {
      super.aE_();
      int $$0 = this.g / 2 - 155;
      int $$1 = $$0 + 160;
      int $$2 = this.h / 6 - 12;
      this.d(esh.a(tf.c("options.mouse_settings"), $$0x -> this.f.a(new exn(this, this.b))).a($$0, $$2, 150, 20).a());
      this.d(esh.a(tf.c("controls.keybinds"), $$0x -> this.f.a(new eys(this, this.b))).a($$1, $$2, 150, 20).a());
      $$2 += 24;
      this.d(this.b.X().a(this.b, $$0, $$2, 150));
      this.d(this.b.Y().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(this.b.D().a(this.b, $$0, $$2, 150));
      this.d(this.b.E().a(this.b, $$1, $$2, 150));
      $$2 += 24;
      this.d(esh.a(te.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, $$2, 200, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
