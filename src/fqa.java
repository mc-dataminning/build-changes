public class fqa<T extends bpr & cge> extends fos<T> {
   public fqa(frf $$0) {
      super($$0);
   }

   public static frl c() {
      frn $$0 = fos.a(frj.a, 0.0F);
      fro $$1 = $$0.a();
      $$1.a("right_arm", frk.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), frh.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", frk.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), frh.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", frk.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), frh.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", frk.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), frh.a(2.0F, 12.0F, 0.0F));
      return frl.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fos.a.a;
      this.r = fos.a.a;
      cqm $$4 = $$0.b(bnc.a);
      if ($$4.a(cqp.ot) && $$0.gf()) {
         if ($$0.fr() == bpj.b) {
            this.s = fos.a.d;
         } else {
            this.r = fos.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cqm $$6 = $$0.eU();
      if ($$0.gf() && ($$6.b() || !$$6.a(cqp.ot))) {
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
         fnc.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bpj $$0, eub $$1) {
      float $$2 = $$0 == bpj.b ? 1.0F : -1.0F;
      frf $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
