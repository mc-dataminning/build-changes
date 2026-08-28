public class csc extends csn {
   private final csa a;
   private final cnp b;
   private int g;
   private final dco h;

   public csc(cnp $$0, dco $$1, csa $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cvl $$0) {
      return false;
   }

   @Override
   public cvl a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().J());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cvl $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cvl $$0) {
      $$0.a(this.b.dS(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cnp $$0, cvl $$1) {
      this.b_($$1);
      dcp $$2 = this.a.g();
      if ($$2 != null) {
         cvl $$3 = this.a.a(0);
         cvl $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awn.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}
