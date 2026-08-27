public class fix<T extends bla & cbe> extends fhp<T> {
   public fix(fkb $$0) {
      super($$0);
   }

   public static fkh c() {
      fkj $$0 = fhp.a(fkf.a, 0.0F);
      fkk $$1 = $$0.a();
      $$1.a("right_arm", fkg.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkd.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fkg.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkd.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fkg.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkd.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fkg.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkd.a(2.0F, 12.0F, 0.0F));
      return fkh.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fhp.a.a;
      this.r = fhp.a.a;
      clb $$4 = $$0.b(bip.a);
      if ($$4.a(cle.nG) && $$0.fW()) {
         if ($$0.fm() == bks.b) {
            this.s = fhp.a.d;
         } else {
            this.r = fhp.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      clb $$6 = $$0.eS();
      if ($$0.fW() && ($$6.b() || !$$6.a(cle.nG))) {
         float $$7 = ati.a(this.c * (float) Math.PI);
         float $$8 = ati.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fgc.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bks $$0, enk $$1) {
      float $$2 = $$0 == bks.b ? 1.0F : -1.0F;
      fkb $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
