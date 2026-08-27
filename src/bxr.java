public class bxr extends bxt {
   public bxr(bok $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected ehn a(int $$0) {
      this.o = new ehi();
      this.o.a(true);
      return new ehn(this.o, $$0);
   }

   @Override
   protected boolean a(enz $$0, enz $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bd() || !this.a.bO();
   }

   @Override
   protected enz b() {
      return this.a.dk();
   }

   @Override
   public ehl a(bnq $$0, int $$1) {
      return this.a($$0.dm(), $$1);
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
            enz $$0 = this.c.a(this.a);
            if (this.a.dq() == awi.a($$0.c) && this.a.ds() == awi.a($$0.d) && this.a.dw() == awi.a($$0.e)) {
               this.c.a();
            }
         }

         aep.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            enz $$1 = this.c.a(this.a);
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
   public boolean a(hz $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
