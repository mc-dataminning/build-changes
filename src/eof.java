public class eof extends ger {
   private static final tf a = tf.c("mco.account.privacyinfo");
   private final eya b;
   private esz c = esz.a;

   public eof(eya $$0) {
      super(eqd.a);
      this.b = $$0;
   }

   @Override
   public void aC_() {
      tf $$0 = tf.c("mco.account.update");
      tf $$1 = te.k;
      int $$2 = Math.max(this.i.a($$0), this.i.a($$1)) + 30;
      tf $$3 = tf.c("mco.account.privacy.info");
      int $$4 = (int)((double)this.i.a($$3) * 1.2);
      this.d(esg.a($$3, $$0x -> ac.i().a("https://aka.ms/MinecraftGDPR")).a(this.g / 2 - $$4 / 2, h(11), $$4, 20).a());
      this.d(esg.a($$0, $$0x -> ac.i().a("https://aka.ms/UpdateMojangAccount")).a(this.g / 2 - ($$2 + 5), h(13), $$2, 20).a());
      this.d(esg.a($$1, $$0x -> this.f.a(this.b)).a(this.g / 2 + 5, h(13), $$2, 20).a());
      this.c = esz.a(this.i, a, (int)Math.round((double)this.g * 0.9));
   }

   @Override
   public tf e() {
      return a;
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, this.g / 2, 15, 15, 16777215);
   }
}
