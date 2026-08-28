public class ccl extends ccn {
   public ccl(btd $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected eox a(int $$0) {
      this.o = new eos();
      this.o.a(true);
      return new eox(this.o, $$0);
   }

   @Override
   protected boolean a(ewf $$0, ewf $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bj() || !this.a.bS();
   }

   @Override
   protected ewf b() {
      return this.a.do();
   }

   @Override
   public eov a(bsg $$0, int $$1) {
      return this.a($$0.dq(), $$1);
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
            ewf $$0 = this.c.a(this.a);
            if (this.a.du() == ayg.a($$0.c) && this.a.dw() == ayg.a($$0.d) && this.a.dA() == ayg.a($$0.e)) {
               this.c.a();
            }
         }

         afy.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            ewf $$1 = this.c.a(this.a);
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
   public boolean a(ja $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
