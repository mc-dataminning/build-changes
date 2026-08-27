public class cmo extends cmk {
   private int f = 1;

   public cmo(bsc<? extends cmo> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmo(daz $$0, bsq $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bsc.ak, $$1, $$2, $$3, $$4, $$0);
      this.f = $$5;
   }

   @Override
   protected void a(euk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().aa().b(dav.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.f, $$1, daz.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(euj $$0) {
      super.a($$0);
      if (!this.dP().B) {
         brw $$1 = $$0.a();
         brw $$2 = this.s();
         $$1.a(this.dQ().a((cmk)this, $$2), 6.0F);
         if ($$2 instanceof bsq) {
            this.a((bsq)$$2, $$1);
         }
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.f);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.f = $$0.f("ExplosionPower");
      }
   }
}
