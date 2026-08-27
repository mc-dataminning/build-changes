public class bzx extends bzz {
   public bzx(bqq $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected eli a(int $$0) {
      this.o = new eld();
      this.o.a(true);
      return new eli(this.o, $$0);
   }

   @Override
   protected boolean a(esa $$0, esa $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bg() || !this.a.bO();
   }

   @Override
   protected esa b() {
      return this.a.dk();
   }

   @Override
   public elg a(bpv $$0, int $$1) {
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
            esa $$0 = this.c.a(this.a);
            if (this.a.dq() == axk.a($$0.c) && this.a.ds() == axk.a($$0.d) && this.a.dw() == axk.a($$0.e)) {
               this.c.a();
            }
         }

         afi.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            esa $$1 = this.c.a(this.a);
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
   public boolean a(ib $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
