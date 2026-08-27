public class fsq<T extends bqv & chk> extends fri<T> {
   public fsq(ftv $$0) {
      super($$0);
   }

   public static fub e() {
      fud $$0 = fri.a(ftz.a, 0.0F);
      fue $$1 = $$0.a();
      a($$1);
      return fub.a($$0, 64, 32);
   }

   protected static void a(fue $$0) {
      $$0.a("right_arm", fua.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), ftx.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fua.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), ftx.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fua.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), ftx.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fua.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), ftx.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fri.a.a;
      this.r = fri.a.a;
      crs $$4 = $$0.b(boe.a);
      if ($$4.a(crv.ot) && $$0.gf()) {
         if ($$0.fr() == bqn.b) {
            this.s = fri.a.d;
         } else {
            this.r = fri.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      crs $$6 = $$0.eU();
      if ($$0.gf() && ($$6.d() || !$$6.a(crv.ot))) {
         float $$7 = axm.a(this.c * (float) Math.PI);
         float $$8 = axm.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fps.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bqn $$0, ewr $$1) {
      float $$2 = $$0 == bqn.b ? 1.0F : -1.0F;
      ftv $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
