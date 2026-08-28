public class cqt extends cre {
   private final cqr a;
   private final cml b;
   private int g;
   private final dbd h;

   public cqt(cml $$0, dbd $$1, cqr $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cud $$0) {
      return false;
   }

   @Override
   public cud a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cud $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cud $$0) {
      $$0.a(this.b.dR(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cml $$0, cud $$1) {
      this.b_($$1);
      dbe $$2 = this.a.g();
      if ($$2 != null) {
         cud $$3 = this.a.a(0);
         cud $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avr.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}
