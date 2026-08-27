public class ftm<T extends brg & chv> extends fse<T> {
   public ftm(fur $$0) {
      super($$0);
   }

   public static fux e() {
      fuz $$0 = fse.a(fuv.a, 0.0F);
      fva $$1 = $$0.a();
      a($$1);
      return fux.a($$0, 64, 32);
   }

   protected static void a(fva $$0) {
      $$0.a("right_arm", fuw.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fut.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fuw.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fut.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fuw.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fut.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fuw.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fut.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fse.a.a;
      this.r = fse.a.a;
      csd $$4 = $$0.b(bop.a);
      if ($$4.a(csg.ou) && $$0.gh()) {
         if ($$0.fs() == bqy.b) {
            this.s = fse.a.d;
         } else {
            this.r = fse.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      csd $$6 = $$0.eV();
      if ($$0.gh() && ($$6.d() || !$$6.a(csg.ou))) {
         float $$7 = axw.a(this.c * (float) Math.PI);
         float $$8 = axw.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fqo.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bqy $$0, exn $$1) {
      float $$2 = $$0 == bqy.b ? 1.0F : -1.0F;
      fur $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
