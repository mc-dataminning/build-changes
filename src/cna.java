public class cna extends cmw {
   private int e = 1;

   public cna(bsm<? extends cna> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cna(dcf $$0, btb $$1, ewf $$2, int $$3) {
      super(bsm.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         boolean $$1 = this.dQ().ab().b(dcb.c);
         this.dQ().a(this, this.dv(), this.dx(), this.dB(), (float)this.e, $$1, dcf.a.c);
         this.ap();
      }
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqm $$1) {
         bsg var6 = $$0.a();
         bsg $$4 = this.s();
         bqz $$5 = this.dR().a((cmw)this, $$4);
         var6.a($$5, 6.0F);
         czn.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
