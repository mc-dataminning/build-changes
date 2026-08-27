public class fqr extends fol<cka> {
   private static final int a = 16;
   private final frd b;
   private final frd f;
   private final frd g;

   public fqr(frd $$0) {
      super(fxy::i);
      this.b = $$0.b("bone");
      this.g = this.b.b("wind");
      this.f = this.b.b("wind_charge");
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("bone", fri.c(), frf.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         fri.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new frh(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new frh(0.0F)),
         frf.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", fri.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new frh(0.0F)), frf.a(0.0F, 0.0F, 0.0F));
      return frj.a($$0, 64, 32);
   }

   public void a(cka $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = -$$3 * 16.0F * (float) (Math.PI / 180.0);
      this.g.f = $$3 * 16.0F * (float) (Math.PI / 180.0);
   }

   @Override
   public frd a() {
      return this.b;
   }
}
