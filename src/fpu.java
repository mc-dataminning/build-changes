public class fpu<T extends bof> extends fpq<T> {
   private boolean b;

   public fpu(fqf $$0) {
      super($$0);
   }

   public static fql c() {
      fqn $$0 = fpq.b();
      fqo $$1 = $$0.a();
      fqo $$2 = $$1.a("head", fqk.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fqh.a);
      fqo $$3 = $$2.a("hat", fqk.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), fqh.a(-5.0F, -10.03125F, -5.0F));
      fqo $$4 = $$3.a("hat2", fqk.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), fqh.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      fqo $$5 = $$4.a("hat3", fqk.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), fqh.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", fqk.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new fqj(0.25F)), fqh.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      fqo $$6 = $$2.a("nose");
      $$6.a("mole", fqk.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new fqj(-0.25F)), fqh.a(0.0F, -2.0F, 0.0F));
      return fql.a($$0, 64, 128);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.a(0.0F, -2.0F, 0.0F);
      float $$6 = 0.01F * (float)($$0.aj() % 10);
      this.a.e = awm.a((float)$$0.ag * $$6) * 4.5F * (float) (Math.PI / 180.0);
      this.a.f = 0.0F;
      this.a.g = awm.b((float)$$0.ag * $$6) * 2.5F * (float) (Math.PI / 180.0);
      if (this.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public fqf e() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }
}
