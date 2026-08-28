public class crf extends crq {
   private final crd a;
   private final cmy b;
   private int g;
   private final daw h;

   public crf(cmy $$0, daw $$1, crd $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cuq $$0) {
      return false;
   }

   @Override
   public cuq a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuq $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuq $$0) {
      $$0.a(this.b.dP(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cmy $$0, cuq $$1) {
      this.b_($$1);
      dax $$2 = this.a.g();
      if ($$2 != null) {
         cuq $$3 = this.a.a(0);
         cuq $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
