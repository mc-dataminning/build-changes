public class cek extends ceg {
   private int e = 1;

   public cek(bku<? extends cek> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cek(csa $$0, blg $$1, double $$2, double $$3, double $$4, int $$5) {
      super(bku.ag, $$1, $$2, $$3, $$4, $$0);
      this.e = $$5;
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);
      if (!this.dN().B) {
         boolean $$1 = this.dN().Y().b(crw.c);
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.e, $$1, csa.a.c);
         this.am();
      }
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkq $$1 = $$0.a();
         bkq $$2 = this.w();
         $$1.a(this.dO().a((ceg)this, $$2), 6.0F);
         if ($$2 instanceof blg) {
            this.a((blg)$$2, $$1);
         }
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.e);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.e = $$0.f("ExplosionPower");
      }
   }
}
