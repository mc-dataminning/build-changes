public class crd extends cro {
   private final crb a;
   private final cmv b;
   private int g;
   private final dbr h;

   public crd(cmv $$0, dbr $$1, crb $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cuo $$0) {
      return false;
   }

   @Override
   public cuo a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().H());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cuo $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cuo $$0) {
      $$0.a(this.b.dQ(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cmv $$0, cuo $$1) {
      this.b_($$1);
      dbs $$2 = this.a.g();
      if ($$2 != null) {
         cuo $$3 = this.a.a(0);
         cuo $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avy.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.q());
      }
   }
}
