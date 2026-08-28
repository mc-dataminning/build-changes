public class coz extends cov {
   private int e = 1;

   public coz(bug<? extends coz> $$0, dev $$1) {
      super($$0, $$1);
   }

   public coz(dev $$0, buv $$1, ezh $$2, int $$3) {
      super(bug.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ezf $$0) {
      super.a($$0);
      if (!this.dX().C) {
         boolean $$1 = this.dX().ac().b(der.c);
         this.dX().a(this, this.dC(), this.dE(), this.dI(), (float)this.e, $$1, dev.a.c);
         this.au();
      }
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (this.dX() instanceof arm $$1) {
         btz var6 = $$0.a();
         btz $$4 = this.s();
         bsp $$5 = this.dY().a((cov)this, $$4);
         var6.a($$5, 6.0F);
         dbo.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
