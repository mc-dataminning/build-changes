public class cjk extends cjg {
   private int e = 1;

   public cjk(bpd<? extends cjk> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjk(cxb $$0, bpp $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bpd.ak, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         boolean $$1 = this.dM().Z().b(cwx.c);
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.e, $$1, cxb.a.c);
         this.am();
      }
   }

   @Override
   protected void a(epq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         box $$1 = $$0.a();
         box $$2 = this.af_();
         $$1.a(this.dN().a((cjg)this, $$2), 6.0F);
         if ($$2 instanceof bpp) {
            this.a((bpp)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
