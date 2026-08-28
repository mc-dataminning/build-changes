public class cqs extends crd {
   private final cqq a;
   private final cmk b;
   private int g;
   private final dbc h;

   public cqs(cmk $$0, dbc $$1, cqq $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cuc $$0) {
      return false;
   }

   @Override
   public cuc a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuc $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuc $$0) {
      $$0.a(this.b.dQ(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cmk $$0, cuc $$1) {
      this.b_($$1);
      dbd $$2 = this.a.g();
      if ($$2 != null) {
         cuc $$3 = this.a.a(0);
         cuc $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avr.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.u() + $$2.q());
      }
   }
}
