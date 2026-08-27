public class fug<T extends bql> extends fuc<T> {
   private boolean b;

   public fug(fur $$0) {
      super($$0);
   }

   public static fux c() {
      fuz $$0 = fuc.b();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("head", fuw.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fut.a);
      fva $$3 = $$2.a("hat", fuw.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), fut.a(-5.0F, -10.03125F, -5.0F));
      fva $$4 = $$3.a("hat2", fuw.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), fut.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      fva $$5 = $$4.a("hat3", fuw.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), fut.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", fuw.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new fuv(0.25F)), fut.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      fva $$6 = $$2.a("nose");
      $$6.a("mole", fuw.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new fuv(-0.25F)), fut.a(0.0F, -2.0F, 0.0F));
      return fux.a($$0, 64, 128);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$6 = 0.01F * (float)($$0.aj() % 10);
      this.a.e = axw.a((float)$$0.ai * $$6) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = axw.b((float)$$0.ai * $$6) * 2.5F * (float) (Math.PI / 180.0);
      if (this.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public fur e() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }
}
