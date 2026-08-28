public class cnb extends cmx {
   private int e = 1;

   public cnb(bsn<? extends cnb> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnb(dcg $$0, btc $$1, ewh $$2, int $$3) {
      super(bsn.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         boolean $$1 = this.dR().ab().b(dcc.c);
         this.dR().a(this, this.dw(), this.dy(), this.dC(), (float)this.e, $$1, dcg.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (this.dR() instanceof aqm $$1) {
         bsh var6 = $$0.a();
         bsh $$4 = this.s();
         bra $$5 = this.dS().a((cmx)this, $$4);
         var6.a($$5, 6.0F);
         czo.a($$1, var6, $$5);
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
