public class cnn extends cnj {
   private int e = 1;

   public cnn(bsx<? extends cnn> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnn(dcw $$0, btn $$1, exa $$2, int $$3) {
      super(bsx.ak, $$1, $$2, $$0);
      this.e = $$3;
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      if (!this.dP().B) {
         boolean $$1 = this.dP().ab().b(dcs.c);
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.e, $$1, dcw.a.c);
         this.aq();
      }
   }

   @Override
   protected void a(ewx $$0) {
      super.a($$0);
      if (this.dP() instanceof aqu $$1) {
         bsr var6 = $$0.a();
         bsr $$4 = this.s();
         brk $$5 = this.dQ().a((cnj)this, $$4);
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
