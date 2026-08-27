public class fgj<T extends bja & bzf> extends ffb<T> {
   public fgj(fhn $$0) {
      super($$0);
   }

   public static fht c() {
      fhv $$0 = ffb.a(fhr.a, 0.0F);
      fhw $$1 = $$0.a();
      $$1.a("right_arm", fhs.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhp.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fhs.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhp.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fhs.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhp.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fhs.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhp.a(2.0F, 12.0F, 0.0F));
      return fht.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ffb.a.a;
      this.r = ffb.a.a;
      ciy $$4 = $$0.b(bgp.a);
      if ($$4.a(cjb.nG) && $$0.fS()) {
         if ($$0.fk() == bis.b) {
            this.s = ffb.a.d;
         } else {
            this.r = ffb.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ciy $$6 = $$0.eR();
      if ($$0.fS() && ($$6.b() || !$$6.a(cjb.nG))) {
         float $$7 = arp.a(this.c * (float) Math.PI);
         float $$8 = arp.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fdo.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bis $$0, elg $$1) {
      float $$2 = $$0 == bis.b ? 1.0F : -1.0F;
      fhn $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
