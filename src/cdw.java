public class cdw extends cdy {
   public cdw(bup $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected erj a(int $$0) {
      this.o = new ere();
      this.o.a(true);
      return new erj(this.o, $$0);
   }

   @Override
   protected boolean a(eyw $$0, eyw $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.a.bm() || !this.a.bW();
   }

   @Override
   protected eyw b() {
      return this.a.dq();
   }

   @Override
   public erh a(btr $$0, int $$1) {
      return this.a($$0.ds(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.j();
      }

      if (!this.m()) {
         if (this.a()) {
            this.l();
         } else if (this.c != null && !this.c.c()) {
            eyw $$0 = this.c.a(this.a);
            if (this.a.dw() == azf.a($$0.d) && this.a.dy() == azf.a($$0.e) && this.a.dC() == azf.a($$0.f)) {
               this.c.a();
            }
         }

         ago.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            eyw $$1 = this.c.a(this.a);
            this.a.M().a($$1.d, $$1.e, $$1.f, this.d);
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
   public boolean a(jf $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
