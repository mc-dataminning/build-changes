public class eok extends gew {
   private static final ti a = ti.c("mco.account.privacyinfo");
   private final eyf b;
   private ete c = ete.a;

   public eok(eyf $$0) {
      super(eqi.a);
      this.b = $$0;
   }

   @Override
   public void aD_() {
      ti $$0 = ti.c("mco.account.update");
      ti $$1 = th.k;
      int $$2 = Math.max(this.i.a($$0), this.i.a($$1)) + 30;
      ti $$3 = ti.c("mco.account.privacy.info");
      int $$4 = (int)((double)this.i.a($$3) * 1.2);
      this.d(esl.a($$3, $$0x -> ac.i().a("https://aka.ms/MinecraftGDPR")).a(this.g / 2 - $$4 / 2, h(11), $$4, 20).a());
      this.d(esl.a($$0, $$0x -> ac.i().a("https://aka.ms/UpdateMojangAccount")).a(this.g / 2 - ($$2 + 5), h(13), $$2, 20).a());
      this.d(esl.a($$1, $$0x -> this.f.a(this.b)).a(this.g / 2 + 5, h(13), $$2, 20).a());
      this.c = ete.a(this.i, a, (int)Math.round((double)this.g * 0.9));
   }

   @Override
   public ti g() {
      return a;
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, this.g / 2, 15, 15, 16777215);
   }
}
