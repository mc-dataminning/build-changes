public class cdb extends cdd {
   public cdb(btt $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected eon a(int $$0) {
      this.o = new eoi();
      this.o.a(true);
      return new eon(this.o, $$0);
   }

   @Override
   protected boolean a(evt $$0, evt $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bi() || !this.a.bR();
   }

   @Override
   protected evt b() {
      return this.a.dn();
   }

   @Override
   public eol a(bsw $$0, int $$1) {
      return this.a($$0.dp(), $$1);
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
            evt $$0 = this.c.a(this.a);
            if (this.a.dt() == ayz.a($$0.c) && this.a.dv() == ayz.a($$0.d) && this.a.dz() == ayz.a($$0.e)) {
               this.c.a();
            }
         }

         agt.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            evt $$1 = this.c.a(this.a);
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
   public boolean a(iz $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
