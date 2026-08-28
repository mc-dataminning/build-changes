public class cwr extends cxc {
   private final cwp a;
   private final crm b;
   private int g;
   private final dih h;

   public cwr(crm $$0, dih $$1, cwp $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(czn $$0) {
      return false;
   }

   @Override
   public czn a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(czn $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(czn $$0) {
      $$0.a(this.b.dU(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(crm $$0, czn $$1) {
      this.c_($$1);
      dii $$2 = this.a.g();
      if ($$2 != null) {
         czn $$3 = this.a.a(0);
         czn $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awx.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
