public class can extends cap {
   public can(brg $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected emh a(int $$0) {
      this.o = new emc();
      this.o.a(true);
      return new emh(this.o, $$0);
   }

   @Override
   protected boolean a(etf $$0, etf $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bg() || !this.a.bP();
   }

   @Override
   protected etf b() {
      return this.a.dl();
   }

   @Override
   public emf a(bql $$0, int $$1) {
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
            etf $$0 = this.c.a(this.a);
            if (this.a.dr() == axw.a($$0.c) && this.a.dt() == axw.a($$0.d) && this.a.dx() == axw.a($$0.e)) {
               this.c.a();
            }
         }

         afu.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            etf $$1 = this.c.a(this.a);
            this.a.H().a($$1.c, $$1.d, $$1.e, this.d);
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
   public boolean a(im $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
