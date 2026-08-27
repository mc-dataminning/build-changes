public class eop extends gfb {
   private static final tl a = tl.c("mco.account.privacyinfo");
   private final eyk b;
   private etj c = etj.a;

   public eop(eyk $$0) {
      super(eqn.a);
      this.b = $$0;
   }

   @Override
   public void aH_() {
      tl $$0 = tl.c("mco.account.update");
      tl $$1 = tk.k;
      int $$2 = Math.max(this.i.a($$0), this.i.a($$1)) + 30;
      tl $$3 = tl.c("mco.account.privacy.info");
      int $$4 = (int)((double)this.i.a($$3) * 1.2);
      this.d(esq.a($$3, $$0x -> ac.i().a("https://aka.ms/MinecraftGDPR")).a(this.g / 2 - $$4 / 2, h(11), $$4, 20).a());
      this.d(esq.a($$0, $$0x -> ac.i().a("https://aka.ms/UpdateMojangAccount")).a(this.g / 2 - ($$2 + 5), h(13), $$2, 20).a());
      this.d(esq.a($$1, $$0x -> this.f.a(this.b)).a(this.g / 2 + 5, h(13), $$2, 20).a());
      this.c = etj.a(this.i, a, (int)Math.round((double)this.g * 0.9));
   }

   @Override
   public tl g() {
      return a;
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, this.g / 2, 15, 15, 16777215);
   }
}
