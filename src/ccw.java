public class ccw extends ccy {
   public ccw(btn $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected epo a(int $$0) {
      this.o = new epj();
      this.o.a(true);
      return new epo(this.o, $$0);
   }

   @Override
   protected boolean a(eww $$0, eww $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bj() || !this.a.bS();
   }

   @Override
   protected eww b() {
      return this.a.do();
   }

   @Override
   public epm a(bsq $$0, int $$1) {
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
            eww $$0 = this.c.a(this.a);
            if (this.a.du() == ayn.a($$0.c) && this.a.dw() == ayn.a($$0.d) && this.a.dA() == ayn.a($$0.e)) {
               this.c.a();
            }
         }

         age.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            eww $$1 = this.c.a(this.a);
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
   public boolean a(jd $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
