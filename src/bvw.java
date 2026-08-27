public class bvw extends bvy {
   public bvw(bmq $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected efq a(int $$0) {
      this.o = new efl();
      this.o.a(true);
      return new efq(this.o, $$0);
   }

   @Override
   protected boolean a(emc $$0, emc $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bd() || !this.a.bO();
   }

   @Override
   protected emc b() {
      return this.a.dj();
   }

   @Override
   public efo a(blw $$0, int $$1) {
      return this.a($$0.dl(), $$1);
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
            emc $$0 = this.c.a(this.a);
            if (this.a.dp() == aup.a($$0.c) && this.a.dr() == aup.a($$0.d) && this.a.dv() == aup.a($$0.e)) {
               this.c.a();
            }
         }

         adj.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            emc $$1 = this.c.a(this.a);
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
   public boolean a(hx $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
