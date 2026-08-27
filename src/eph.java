public class eph extends gfx {
   private static final ui a = ui.c("mco.account.privacyinfo");
   private final ezd b;
   private euc c = euc.a;

   public eph(ezd $$0) {
      super(erg.a);
      this.b = $$0;
   }

   @Override
   public void aM_() {
      ui $$0 = ui.c("mco.account.update");
      ui $$1 = uh.k;
      int $$2 = Math.max(this.i.a($$0), this.i.a($$1)) + 30;
      ui $$3 = ui.c("mco.account.privacy.info");
      int $$4 = (int)((double)this.i.a($$3) * 1.2);
      this.d(etj.a($$3, $$0x -> ac.i().a("https://aka.ms/MinecraftGDPR")).a(this.g / 2 - $$4 / 2, h(11), $$4, 20).a());
      this.d(etj.a($$0, $$0x -> ac.i().a("https://aka.ms/UpdateMojangAccount")).a(this.g / 2 - ($$2 + 5), h(13), $$2, 20).a());
      this.d(etj.a($$1, $$0x -> this.f.a(this.b)).a(this.g / 2 + 5, h(13), $$2, 20).a());
      this.c = euc.a(this.i, a, (int)Math.round((double)this.g * 0.9));
   }

   @Override
   public ui h() {
      return a;
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, this.g / 2, 15, 15, 16777215);
   }
}
