public class ctl extends ctw {
   private final ctj a;
   private final cou b;
   private int g;
   private final dei h;

   public ctl(cou $$0, dei $$1, ctj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwm $$0) {
      return false;
   }

   @Override
   public cwm a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwm $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwm $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cou $$0, cwm $$1) {
      this.b_($$1);
      dej $$2 = this.a.g();
      if ($$2 != null) {
         cwm $$3 = this.a.a(0);
         cwm $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awx.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.q() + $$2.q());
      }
   }
}
