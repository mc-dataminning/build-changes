public class ftr<T extends ckr> extends fwn<T> {
   public ftr(fwv $$0) {
      super($$0);
   }

   public static fxb a(fwz $$0) {
      fxd $$1 = fui.a($$0, 0.0F);
      fxe $$2 = $$1.a();
      $$2.a("left_arm", fxa.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fwx.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", fxa.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fwx.a(1.9F, 12.0F, 0.0F));
      return fxb.a($$1, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fui.a.a;
      this.r = fui.a.a;
      cuk $$4 = $$0.b(bqo.a);
      if ($$4.a(cun.vP) && $$0.gi()) {
         if ($$0.fu() == bte.b) {
            this.s = fui.a.e;
         } else {
            this.r = fui.a.e;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (this.r == fui.a.e) {
         this.o.e = this.o.e * 0.5F - (float) Math.PI;
         this.o.f = 0.0F;
      }

      if (this.s == fui.a.e) {
         this.n.e = this.n.e * 0.5F - (float) Math.PI;
         this.n.f = 0.0F;
      }

      if (this.u > 0.0F) {
         this.n.e = this.a(this.u, this.n.e, (float) (-Math.PI * 4.0 / 5.0)) + this.u * 0.35F * ayu.a(0.1F * $$3);
         this.o.e = this.a(this.u, this.o.e, (float) (-Math.PI * 4.0 / 5.0)) - this.u * 0.35F * ayu.a(0.1F * $$3);
         this.n.g = this.a(this.u, this.n.g, -0.15F);
         this.o.g = this.a(this.u, this.o.g, 0.15F);
         this.q.e = this.q.e - this.u * 0.55F * ayu.a(0.1F * $$3);
         this.p.e = this.p.e + this.u * 0.55F * ayu.a(0.1F * $$3);
         this.k.e = 0.0F;
      }
   }
}
