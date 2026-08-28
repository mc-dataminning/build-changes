public class cnn extends cnj {
   private int e = 1;

   public cnn(bsx<? extends cnn> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnn(dcw $$0, btn $$1, exc $$2, int $$3) {
      super(bsx.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      if (!this.dO().B) {
         boolean $$1 = this.dO().ab().b(dcs.c);
         this.dO().a(this, this.dt(), this.dv(), this.dz(), (float)this.e, $$1, dcw.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ewz $$0) {
      super.a($$0);
      if (this.dO() instanceof aqu $$1) {
         bsr var6 = $$0.a();
         bsr $$4 = this.s();
         brk $$5 = this.dP().a((cnj)this, $$4);
         var6.a($$5, 6.0F);
         dae.a($$1, var6, $$5);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
