public class ccn extends ccx {
   private final ccl a;
   private final byo b;
   private int c;
   private final clj h;

   public ccn(byo $$0, clj $$1, ccl $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cfz $$0) {
      return false;
   }

   @Override
   public cfz a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cfz $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cfz $$0) {
      $$0.a(this.b.dI(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(byo $$0, cfz $$1) {
      this.b_($$1);
      clk $$2 = this.a.g();
      if ($$2 != null) {
         cfz $$3 = this.a.a(0);
         cfz $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(amr.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.r() + $$2.o());
      }
   }
}
