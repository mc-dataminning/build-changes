public class ceo extends ceq {
   public ceo(bvg $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected ese a(int $$0) {
      this.o = new erz();
      this.o.a(true);
      return new ese(this.o, $$0);
   }

   @Override
   protected boolean a(ezr $$0, ezr $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.q() && this.a.bp() || !this.a.cb();
   }

   @Override
   protected ezr b() {
      return this.a.dw();
   }

   @Override
   public esc a(bui $$0, int $$1) {
      return this.a($$0.dy(), $$1);
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
            ezr $$0 = this.c.a(this.a);
            if (this.a.dC() == azn.a($$0.d) && this.a.dE() == azn.a($$0.e) && this.a.dI() == azn.a($$0.f)) {
               this.c.a();
            }
         }

         agv.a(this.b, this.a, this.c, this.l);
         if (!this.m()) {
            ezr $$1 = this.c.a(this.a);
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
   public boolean a(jh $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
