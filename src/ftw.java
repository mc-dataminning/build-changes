public class ftw<T extends ckw> extends fws<T> {
   public ftw(fxa $$0) {
      super($$0);
   }

   public static fxg a(fxe $$0) {
      fxi $$1 = fun.a($$0, 0.0F);
      fxj $$2 = $$1.a();
      $$2.a("left_arm", fxf.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fxc.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", fxf.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fxc.a(1.9F, 12.0F, 0.0F));
      return fxg.a($$1, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fun.a.a;
      this.r = fun.a.a;
      cup $$4 = $$0.b(bqt.a);
      if ($$4.a(cus.vP) && $$0.gi()) {
         if ($$0.fu() == btj.b) {
            this.s = fun.a.e;
         } else {
            this.r = fun.a.e;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (this.r == fun.a.e) {
         this.o.e = this.o.e * 0.5F - (float) Math.PI;
         this.o.f = 0.0F;
      }

      if (this.s == fun.a.e) {
         this.n.e = this.n.e * 0.5F - (float) Math.PI;
         this.n.f = 0.0F;
      }

      if (this.u > 0.0F) {
         this.n.e = this.a(this.u, this.n.e, (float) (-Math.PI * 4.0 / 5.0)) + this.u * 0.35F * ayz.a(0.1F * $$3);
         this.o.e = this.a(this.u, this.o.e, (float) (-Math.PI * 4.0 / 5.0)) - this.u * 0.35F * ayz.a(0.1F * $$3);
         this.n.g = this.a(this.u, this.n.g, -0.15F);
         this.o.g = this.a(this.u, this.o.g, 0.15F);
         this.q.e = this.q.e - this.u * 0.55F * ayz.a(0.1F * $$3);
         this.p.e = this.p.e + this.u * 0.55F * ayz.a(0.1F * $$3);
         this.k.e = 0.0F;
      }
   }
}
