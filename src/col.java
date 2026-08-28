public class col extends coh {
   private int e = 1;

   public col(btv<? extends col> $$0, deg $$1) {
      super($$0, $$1);
   }

   public col(deg $$0, buk $$1, eys $$2, int $$3) {
      super(btv.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if (!this.dS().B) {
         boolean $$1 = this.dS().ac().b(dec.c);
         this.dS().a(this, this.dx(), this.dz(), this.dD(), (float)this.e, $$1, deg.a.c);
         this.as();
      }
   }

   @Override
   protected void a(eyp $$0) {
      super.a($$0);
      if (this.dS() instanceof arh $$1) {
         bto var6 = $$0.a();
         bto $$4 = this.s();
         bsg $$5 = this.dT().a((coh)this, $$4);
         var6.a($$5, 6.0F);
         dbm.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
