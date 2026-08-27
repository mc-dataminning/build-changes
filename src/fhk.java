public class fhk extends fgz {
   public fhk(fhh $$0, ezm $$1) {
      super($$0, $$1, vu.c("options.skinCustomisation.title"));
   }

   @Override
   protected void aO_() {
      int $$0 = 0;

      for (civ $$1 : civ.values()) {
         this.c(fbp.b(this.b.a($$1)).a(this.g / 2 - 155 + $$0 % 2 * 160, this.h / 6 + 24 * ($$0 >> 1), 150, 20, $$1.d(), ($$1x, $$2) -> this.b.a($$1, $$2)));
         $$0++;
      }

      this.c(this.b.t().a(this.b, this.g / 2 - 155 + $$0 % 2 * 160, this.h / 6 + 24 * ($$0 >> 1), 150));
      if (++$$0 % 2 == 1) {
         $$0++;
      }

      this.c(fbi.a(vt.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h / 6 + 24 * ($$0 >> 1), 200, 20).a());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }
}
