public class cfq extends cfs {
   public cfq(bwi $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected eun a(int $$0) {
      this.o = new eui();
      this.o.a(true);
      return new eun(this.o, $$0);
   }

   @Override
   protected boolean a(fby $$0, fby $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.a.bn() || !this.a.bZ();
   }

   @Override
   protected fby b() {
      return this.a.du();
   }

   @Override
   public eul a(bvk $$0, int $$1) {
      return this.a($$0.dw(), $$1);
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
            fby $$0 = this.c.a(this.a);
            if (this.a.dA() == bae.a($$0.d) && this.a.dC() == bae.a($$0.e) && this.a.dG() == bae.a($$0.f)) {
               this.c.a();
            }
         }

         ahj.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            fby $$1 = this.c.a(this.a);
            this.a.I().a($$1.d, $$1.e, $$1.f, this.d);
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
   public boolean a(jh $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
