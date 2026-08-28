public class cep extends cer {
   public cep(bvh $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected etn a(int $$0) {
      this.o = new eti();
      return new etn(this.o, $$0);
   }

   @Override
   protected boolean a(fay $$0, fay $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.o() && this.a.bn() || !this.a.bZ();
   }

   @Override
   protected fay b() {
      return this.a.du();
   }

   @Override
   public etl a(buj $$0, int $$1) {
      return this.a($$0.dw(), $$1);
   }

   @Override
   public void c() {
      this.e++;
      if (this.m) {
         this.h();
      }

      if (!this.k()) {
         if (this.a()) {
            this.j();
         } else if (this.c != null && !this.c.c()) {
            fay $$0 = this.c.a(this.a);
            if (this.a.dA() == ayy.a($$0.d) && this.a.dC() == ayy.a($$0.e) && this.a.dG() == ayy.a($$0.f)) {
               this.c.a();
            }
         }

         agc.a(this.b, this.a, this.c, this.l);
         if (!this.k()) {
            fay $$1 = this.c.a(this.a);
            this.a.I().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   @Override
   public boolean a(ji $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
