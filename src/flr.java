public class flr<T extends bmm & ccs> extends fkj<T> {
   public flr(fmw $$0) {
      super($$0);
   }

   public static fnc c() {
      fne $$0 = fkj.a(fna.a, 0.0F);
      fnf $$1 = $$0.a();
      $$1.a("right_arm", fnb.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmy.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fnb.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmy.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fnb.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmy.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fnb.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fmy.a(2.0F, 12.0F, 0.0F));
      return fnc.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fkj.a.a;
      this.r = fkj.a.a;
      cmx $$4 = $$0.b(bjz.a);
      if ($$4.a(cna.or) && $$0.fW()) {
         if ($$0.fm() == bme.b) {
            this.s = fkj.a.d;
         } else {
            this.r = fkj.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cmx $$6 = $$0.eT();
      if ($$0.fW() && ($$6.b() || !$$6.a(cna.or))) {
         float $$7 = aun.a(this.c * (float) Math.PI);
         float $$8 = aun.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fiv.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bme $$0, eqa $$1) {
      float $$2 = $$0 == bme.b ? 1.0F : -1.0F;
      fmw $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
