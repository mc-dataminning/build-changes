public class frx<T extends cjg> extends fut<T> {
   public frx(fvb $$0) {
      super($$0);
   }

   public static fvh a(fvf $$0) {
      fvj $$1 = fso.a($$0, 0.0F);
      fvk $$2 = $$1.a();
      $$2.a("left_arm", fvg.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fvd.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", fvg.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fvd.a(1.9F, 12.0F, 0.0F));
      return fvh.a($$1, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fso.a.a;
      this.r = fso.a.a;
      csz $$4 = $$0.b(bpl.a);
      if ($$4.a(ctc.vP) && $$0.gh()) {
         if ($$0.fs() == bru.b) {
            this.s = fso.a.e;
         } else {
            this.r = fso.a.e;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (this.r == fso.a.e) {
         this.o.e = this.o.e * 0.5F - (float) Math.PI;
         this.o.f = 0.0F;
      }

      if (this.s == fso.a.e) {
         this.n.e = this.n.e * 0.5F - (float) Math.PI;
         this.n.f = 0.0F;
      }

      if (this.u > 0.0F) {
         this.n.e = this.a(this.u, this.n.e, (float) (-Math.PI * 4.0 / 5.0)) + this.u * 0.35F * axz.a(0.1F * $$3);
         this.o.e = this.a(this.u, this.o.e, (float) (-Math.PI * 4.0 / 5.0)) - this.u * 0.35F * axz.a(0.1F * $$3);
         this.n.g = this.a(this.u, this.n.g, -0.15F);
         this.o.g = this.a(this.u, this.o.g, 0.15F);
         this.q.e = this.q.e - this.u * 0.55F * axz.a(0.1F * $$3);
         this.p.e = this.p.e + this.u * 0.55F * axz.a(0.1F * $$3);
         this.k.e = 0.0F;
      }
   }
}
