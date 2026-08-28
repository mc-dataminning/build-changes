public class cog extends coc {
   private int e = 1;

   public cog(btq<? extends cog> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cog(dds $$0, buf $$1, eye $$2, int $$3) {
      super(btq.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(eyc $$0) {
      super.a($$0);
      if (!this.dS().B) {
         boolean $$1 = this.dS().ac().b(ddo.c);
         this.dS().a(this, this.dx(), this.dz(), this.dD(), (float)this.e, $$1, dds.a.c);
         this.as();
      }
   }

   @Override
   protected void a(eyb $$0) {
      super.a($$0);
      if (this.dS() instanceof arg $$1) {
         btj var6 = $$0.a();
         btj $$4 = this.s();
         bsb $$5 = this.dT().a((coc)this, $$4);
         var6.a($$5, 6.0F);
         day.a($$1, var6, $$5);
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
