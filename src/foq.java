public class foq<T extends bno> extends fom<T> {
   private boolean b;

   public foq(fpc $$0) {
      super($$0);
   }

   public static fpi c() {
      fpk $$0 = fom.b();
      fpl $$1 = $$0.a();
      fpl $$2 = $$1.a("head", fph.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fpe.a);
      fpl $$3 = $$2.a("hat", fph.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), fpe.a(-5.0F, -10.03125F, -5.0F));
      fpl $$4 = $$3.a("hat2", fph.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), fpe.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      fpl $$5 = $$4.a("hat3", fph.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), fpe.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", fph.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new fpg(0.25F)), fpe.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      fpl $$6 = $$2.a("nose");
      $$6.a("mole", fph.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new fpg(-0.25F)), fpe.a(0.0F, -2.0F, 0.0F));
      return fpi.a($$0, 64, 128);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$6 = 0.01F * (float)($$0.aj() % 10);
      this.a.e = awh.a((float)$$0.ag * $$6) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = awh.b((float)$$0.ag * $$6) * 2.5F * (float) (Math.PI / 180.0);
      if (this.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public fpc e() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }
}
