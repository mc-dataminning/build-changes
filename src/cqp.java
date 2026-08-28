public class cqp extends cra {
   private final cqn a;
   private final cmh b;
   private int g;
   private final dba h;

   public cqp(cmh $$0, dba $$1, cqn $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cua $$0) {
      return false;
   }

   @Override
   public cua a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cua $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cua $$0) {
      $$0.a(this.b.dP(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cmh $$0, cua $$1) {
      this.b_($$1);
      dbb $$2 = this.a.g();
      if ($$2 != null) {
         cua $$3 = this.a.a(0);
         cua $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avp.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.u() + $$2.q());
      }
   }
}
