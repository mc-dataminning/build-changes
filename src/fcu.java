public class fcu<T extends bsh> extends fcp<T> {
   private float j;

   public fcu(fee $$0) {
      super($$0, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
   }

   public static fek c() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("head", fej.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new fei(0.6F)), feg.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", fej.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new fei(1.75F)), feg.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fej $$2 = fej.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new fei(0.5F));
      $$1.a("right_hind_leg", $$2, feg.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, feg.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, feg.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, feg.a(3.0F, 12.0F, -5.0F));
      return fek.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.c = 6.0F + $$0.D($$3) * 9.0F;
      this.j = $$0.E($$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.e = this.j;
   }
}
