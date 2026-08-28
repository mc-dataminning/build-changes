public class ccy extends cda {
   public ccy(btp $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected epu a(int $$0) {
      this.o = new epp();
      this.o.a(true);
      return new epu(this.o, $$0);
   }

   @Override
   protected boolean a(exc $$0, exc $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bj() || !this.a.bS();
   }

   @Override
   protected exc b() {
      return this.a.dm();
   }

   @Override
   public eps a(bsr $$0, int $$1) {
      return this.a($$0.do(), $$1);
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
            exc $$0 = this.c.a(this.a);
            if (this.a.ds() == ayo.a($$0.c) && this.a.du() == ayo.a($$0.d) && this.a.dy() == ayo.a($$0.e)) {
               this.c.a();
            }
         }

         agf.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            exc $$1 = this.c.a(this.a);
            this.a.J().a($$1.c, $$1.d, $$1.e, this.d);
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
