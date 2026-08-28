public class cmx extends cmt {
   private int g = 1;

   public cmx(bsj<? extends cmx> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cmx(dcd $$0, bsy $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bsj.ak, $$1, $$2, $$3, $$4, $$0);
      this.g = $$5;
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dbz.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.g, $$1, dcd.a.c);
         this.ao();
      }
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      if (this.dP() instanceof aqk $$1) {
         bsd var6 = $$0.a();
         bsd $$4 = this.s();
         bqw $$5 = this.dQ().a((cmt)this, $$4);
         var6.a($$5, 6.0F);
         czl.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.g);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.g = $$0.f("ExplosionPower");
      }
   }
}
