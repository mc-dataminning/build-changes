public class cft extends cgd {
   private final cfr a;
   private final cbu b;
   private int c;
   private final cos h;

   public cft(cbu $$0, cos $$1, cfr $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cjf $$0) {
      return false;
   }

   @Override
   public cjf a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cjf $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cjf $$0) {
      $$0.a(this.b.dL(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cbu $$0, cjf $$1) {
      this.b_($$1);
      cot $$2 = this.a.g();
      if ($$2 != null) {
         cjf $$3 = this.a.a(0);
         cjf $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(apn.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.t() + $$2.o());
      }
   }
}
