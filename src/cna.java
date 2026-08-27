public class cna extends cnl {
   private final cmy a;
   private final ciu b;
   private int c;
   private final cvy h;

   public cna(ciu $$0, cvy $$1, cmy $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cqm $$0) {
      return false;
   }

   @Override
   public cqm a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cqm $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cqm $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(ciu $$0, cqm $$1) {
      this.b_($$1);
      cvz $$2 = this.a.g();
      if ($$2 != null) {
         cqm $$3 = this.a.a(0);
         cqm $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(aui.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.s() + $$2.p());
      }
   }
}
