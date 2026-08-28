public class cfh extends cfj {
   public cfh(bvz $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected eug a(int $$0) {
      this.o = new eub();
      this.o.a(true);
      return new eug(this.o, $$0);
   }

   @Override
   protected boolean a(fbr $$0, fbr $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.a.bn() || !this.a.bZ();
   }

   @Override
   protected fbr b() {
      return this.a.du();
   }

   @Override
   public eue a(bvb $$0, int $$1) {
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
            fbr $$0 = this.c.a(this.a);
            if (this.a.dA() == azu.a($$0.d) && this.a.dC() == azu.a($$0.e) && this.a.dG() == azu.a($$0.f)) {
               this.c.a();
            }
         }

         agy.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            fbr $$1 = this.c.a(this.a);
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
