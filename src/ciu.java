public class ciu extends cjf {
   private final cis a;
   private final cer b;
   private int c;
   private final crv h;

   public ciu(cer $$0, crv $$1, cis $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cmh $$0) {
      return false;
   }

   @Override
   public cmh a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cmh $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cmh $$0) {
      $$0.a(this.b.dM(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cer $$0, cmh $$1) {
      this.b_($$1);
      crw $$2 = this.a.g();
      if ($$2 != null) {
         cmh $$3 = this.a.a(0);
         cmh $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(arm.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.w() + $$2.o());
      }
   }
}
