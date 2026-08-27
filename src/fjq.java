public class fjq<T extends bki> extends fjn<T> {
   private boolean b;

   public fjq(fkb $$0) {
      super($$0);
   }

   public static fkh c() {
      fkj $$0 = fjn.b();
      fkk $$1 = $$0.a();
      fkk $$2 = $$1.a("head", fkg.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fkd.a);
      fkk $$3 = $$2.a("hat", fkg.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), fkd.a(-5.0F, -10.03125F, -5.0F));
      fkk $$4 = $$3.a("hat2", fkg.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), fkd.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      fkk $$5 = $$4.a("hat3", fkg.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), fkd.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", fkg.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new fkf(0.25F)), fkd.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      fkk $$6 = $$2.a("nose");
      $$6.a("mole", fkg.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new fkf(-0.25F)), fkd.a(0.0F, -2.0F, 0.0F));
      return fkh.a($$0, 64, 128);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$6 = 0.01F * (float)($$0.ah() % 10);
      this.a.e = ati.a((float)$$0.ah * $$6) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = ati.b((float)$$0.ah * $$6) * 2.5F * (float) (Math.PI / 180.0);
      if (this.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public fkb e() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }
}
