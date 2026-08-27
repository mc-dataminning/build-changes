public class fqt extends fon<ckc> {
   private static final int a = 16;
   private final frf b;
   private final frf f;
   private final frf g;

   public fqt(frf $$0) {
      super(fya::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("bone", frk.c(), frh.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         frk.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new frj(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new frj(0.0F)),
         frh.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", frk.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new frj(0.0F)), frh.a(0.0F, 0.0F, 0.0F));
      return frl.a($$0, 64, 32);
   }

   public void a(ckc $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public frf a() {
      return this.b;
   }
}
