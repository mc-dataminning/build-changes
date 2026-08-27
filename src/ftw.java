public class ftw<T extends bsc & cir> extends fso<T> {
   public ftw(fvb $$0) {
      super($$0);
   }

   public static fvh e() {
      fvj $$0 = fso.a(fvf.a, 0.0F);
      fvk $$1 = $$0.a();
      a($$1);
      return fvh.a($$0, 64, 32);
   }

   protected static void a(fvk $$0) {
      $$0.a("right_arm", fvg.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvd.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fvg.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvd.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fvg.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvd.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fvg.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvd.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fso.a.a;
      this.r = fso.a.a;
      csz $$4 = $$0.b(bpl.a);
      if ($$4.a(ctc.ou) && $$0.gh()) {
         if ($$0.fs() == bru.b) {
            this.s = fso.a.d;
         } else {
            this.r = fso.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      csz $$6 = $$0.eV();
      if ($$0.gh() && ($$6.d() || !$$6.a(ctc.ou))) {
         float $$7 = axz.a(this.c * (float) Math.PI);
         float $$8 = axz.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fqy.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bru $$0, exx $$1) {
      float $$2 = $$0 == bru.b ? 1.0F : -1.0F;
      fvb $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
