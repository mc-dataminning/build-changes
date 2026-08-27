public abstract class fim extends fhz {
   protected fuv E;

   protected fim(few $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
   }

   protected fim(few $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   protected void a(fuv $$0) {
      this.E = $$0;
   }

   @Override
   protected float c() {
      return this.E.c();
   }

   @Override
   protected float d() {
      return this.E.d();
   }

   @Override
   protected float e() {
      return this.E.g();
   }

   @Override
   protected float f() {
      return this.E.h();
   }

   public void a(fih $$0) {
      this.a($$0.a(this.r));
   }

   public void b(fih $$0) {
      if (!this.o) {
         this.a($$0.a(this.s, this.t));
      }
   }
}
