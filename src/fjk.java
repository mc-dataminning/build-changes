public class fjk<T extends bli & cbm> extends fic<T> {
   public fjk(fko $$0) {
      super($$0);
   }

   public static fku c() {
      fkw $$0 = fic.a(fks.a, 0.0F);
      fkx $$1 = $$0.a();
      $$1.a("right_arm", fkt.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkq.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fkt.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkq.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fkt.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkq.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fkt.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkq.a(2.0F, 12.0F, 0.0F));
      return fku.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fic.a.a;
      this.r = fic.a.a;
      clj $$4 = $$0.b(biw.a);
      if ($$4.a(clm.or) && $$0.fX()) {
         if ($$0.fn() == bla.b) {
            this.s = fic.a.d;
         } else {
            this.r = fic.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      clj $$6 = $$0.eU();
      if ($$0.fX() && ($$6.b() || !$$6.a(clm.or))) {
         float $$7 = atm.a(this.c * (float) Math.PI);
         float $$8 = atm.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fgp.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bla $$0, enw $$1) {
      float $$2 = $$0 == bla.b ? 1.0F : -1.0F;
      fko $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
