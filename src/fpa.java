public class fpa<T extends boz & cfk> extends fnr<T> {
   public fpa(fqf $$0) {
      super($$0);
   }

   public static fql c() {
      fqn $$0 = fnr.a(fqj.a, 0.0F);
      fqo $$1 = $$0.a();
      $$1.a("right_arm", fqk.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fqh.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fqk.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fqh.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fqk.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fqh.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fqk.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fqh.a(2.0F, 12.0F, 0.0F));
      return fql.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fnr.a.a;
      this.r = fnr.a.a;
      cpq $$4 = $$0.b(bmk.a);
      if ($$4.a(cpt.ot) && $$0.gd()) {
         if ($$0.fo() == bor.b) {
            this.s = fnr.a.d;
         } else {
            this.r = fnr.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cpq $$6 = $$0.eR();
      if ($$0.gd() && ($$6.b() || !$$6.a(cpt.ot))) {
         float $$7 = awm.a(this.c * (float) Math.PI);
         float $$8 = awm.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fmc.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bor $$0, etd $$1) {
      float $$2 = $$0 == bor.b ? 1.0F : -1.0F;
      fqf $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
