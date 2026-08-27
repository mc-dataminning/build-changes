public class cpo extends cpz {
   private final cpm a;
   private final clh b;
   private int c;
   private final cza h;

   public cpo(clh $$0, cza $$1, cpm $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(csz $$0) {
      return false;
   }

   @Override
   public csz a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().G());
      }

      return super.a($$0);
   }

   @Override
   protected void a(csz $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(csz $$0) {
      $$0.a(this.b.dN(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(clh $$0, csz $$1) {
      this.b_($$1);
      czb $$2 = this.a.g();
      if ($$2 != null) {
         csz $$3 = this.a.a(0);
         csz $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avm.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
