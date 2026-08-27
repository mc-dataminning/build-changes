public class fpy<T extends bpq & cgc> extends fop<T> {
   public fpy(frd $$0) {
      super($$0);
   }

   public static frj c() {
      frl $$0 = fop.a(frh.a, 0.0F);
      frm $$1 = $$0.a();
      $$1.a("right_arm", fri.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), frf.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fri.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), frf.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fri.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), frf.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fri.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), frf.a(2.0F, 12.0F, 0.0F));
      return frj.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fop.a.a;
      this.r = fop.a.a;
      cqk $$4 = $$0.b(bnb.a);
      if ($$4.a(cqn.ot) && $$0.gf()) {
         if ($$0.fr() == bpi.b) {
            this.s = fop.a.d;
         } else {
            this.r = fop.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cqk $$6 = $$0.eU();
      if ($$0.gf() && ($$6.b() || !$$6.a(cqn.ot))) {
         float $$7 = aww.a(this.c * (float) Math.PI);
         float $$8 = aww.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fna.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bpi $$0, etz $$1) {
      float $$2 = $$0 == bpi.b ? 1.0F : -1.0F;
      frd $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
