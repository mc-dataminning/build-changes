public class exy extends exn {
   public exy(exv $$0, eqr $$1) {
      super($$0, $$1, te.c("options.skinCustomisation.title"));
   }

   @Override
   protected void aE_() {
      int $$0 = 0;

      for (cbm $$1 : cbm.values()) {
         this.d(esp.b(this.b.a($$1)).a(this.g / 2 - 155 + $$0 % 2 * 160, this.h / 6 + 24 * ($$0 >> 1), 150, 20, $$1.d(), ($$1x, $$2) -> this.b.a($$1, $$2)));
         $$0++;
      }

      this.d(this.b.r().a(this.b, this.g / 2 - 155 + $$0 % 2 * 160, this.h / 6 + 24 * ($$0 >> 1), 150));
      if (++$$0 % 2 == 1) {
         $$0++;
      }

      this.d(esi.a(td.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h / 6 + 24 * ($$0 >> 1), 200, 20).a());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }
}
