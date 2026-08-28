public class cop extends cok {
   private int e = 1;

   public cop(bty<? extends cop> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cop(dej $$0, bun $$1, eyw $$2, int $$3) {
      super(bty.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if (!this.dS().B) {
         boolean $$1 = this.dS().ac().b(def.c);
         this.dS().a(this, this.dx(), this.dz(), this.dD(), (float)this.e, $$1, dej.a.c);
         this.as();
      }
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      if (this.dS() instanceof arj $$1) {
         btr var6 = $$0.a();
         btr $$4 = this.s();
         bsj $$5 = this.dT().a((cok)this, $$4);
         var6.a($$5, 6.0F);
         dbp.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
