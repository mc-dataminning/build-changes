public class bun extends bup {
   public bun(bli $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected edj a(int $$0) {
      this.o = new ede();
      this.o.a(true);
      return new edj(this.o, $$0);
   }

   @Override
   protected boolean a(eju $$0, eju $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bd() || !this.a.bO();
   }

   @Override
   protected eju b() {
      return this.a.dl();
   }

   @Override
   public edh a(bkq $$0, int $$1) {
      return this.a($$0.dn(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            eju $$0 = this.c.a(this.a);
            if (this.a.dr() == atm.a($$0.c) && this.a.dt() == atm.a($$0.d) && this.a.dx() == atm.a($$0.e)) {
               this.c.a();
            }
         }

         ack.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eju $$1 = this.c.a(this.a);
            this.a.K().a($$1.c, $$1.d, $$1.e, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public boolean d() {
      return this.o.d();
   }

   public void c(boolean $$0) {
      this.o.a($$0);
   }

   public boolean e() {
      return this.o.d();
   }

   @Override
   public boolean a(ht $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
