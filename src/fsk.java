public class fsk<T extends cde> extends fsf<T> {
   private float j;

   public fsk(ftv $$0) {
      super($$0, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
   }

   public static fub c() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      $$1.a("head", fua.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new ftz(0.6F)), ftx.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", fua.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new ftz(1.75F)), ftx.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fua $$2 = fua.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new ftz(0.5F));
      $$1.a("right_hind_leg", $$2, ftx.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, ftx.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, ftx.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, ftx.a(3.0F, 12.0F, -5.0F));
      return fub.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.c = 6.0F + $$0.G($$3) * 9.0F;
      this.j = $$0.H($$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.e = this.j;
   }
}
