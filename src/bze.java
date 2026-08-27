public class bze extends bza {
   private int e = 1;

   public bze(bfn<? extends bze> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bze(cmm $$0, bfz $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bfn.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      if (!this.dI().B) {
         boolean $$1 = this.dI().X().b(cmi.c);
         this.dI().a(this, this.dn(), this.dp(), this.dt(), (float)this.e, $$1, cmm.a.c);
         this.ai();
      }
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      if (!this.dI().B) {
         bfj $$1 = $$0.a();
         bfj $$2 = this.v();
         $$1.a(this.dJ().a((bza)this, $$2), 6.0F);
         if ($$2 instanceof bfz) {
            this.a((bfz)$$2, $$1);
         }
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
