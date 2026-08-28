public class cqz extends crk {
   private final cqx a;
   private final cms b;
   private int g;
   private final daq h;

   public cqz(cms $$0, daq $$1, cqx $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cuk $$0) {
      return false;
   }

   @Override
   public cuk a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuk $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuk $$0) {
      $$0.a(this.b.dP(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cms $$0, cuk $$1) {
      this.b_($$1);
      dar $$2 = this.a.g();
      if ($$2 != null) {
         cuk $$3 = this.a.a(0);
         cuk $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awg.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
