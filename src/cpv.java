public class cpv extends cpr {
   public cpv(bup<? extends cpv> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpv(dff $$0, bve $$1, cwf $$2) {
      super(bup.L, $$1, $$0, $$2);
   }

   public cpv(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      super(bup.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwb o() {
      return cwj.un;
   }

   @Override
   protected double bf() {
      return 0.07;
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (this.dY() instanceof arq) {
         this.dY().c(2002, this.dy(), cye.c(cyf.a));
         int $$1 = 3 + this.dY().A.a(5) + this.dY().A.a(5);
         buu.a((arq)this.dY(), this.dw(), $$1);
         this.av();
      }
   }
}
