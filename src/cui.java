public class cui extends cut {
   private final cug a;
   private final cpr b;
   private int g;
   private final dfw h;

   public cui(cpr $$0, dfw $$1, cug $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cxh $$0) {
      return false;
   }

   @Override
   public cxh a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxh $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxh $$0) {
      $$0.a(this.b.dU(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cpr $$0, cxh $$1) {
      this.b_($$1);
      dfx $$2 = this.a.g();
      if ($$2 != null) {
         cxh $$3 = this.a.a(0);
         cxh $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
