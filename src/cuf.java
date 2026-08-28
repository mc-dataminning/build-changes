public class cuf extends cuq {
   private final cud a;
   private final cpo b;
   private int g;
   private final dfv h;

   public cuf(cpo $$0, dfv $$1, cud $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cxg $$0) {
      return false;
   }

   @Override
   public cxg a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxg $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxg $$0) {
      $$0.a(this.b.dW(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cpo $$0, cxg $$1) {
      this.b_($$1);
      dfw $$2 = this.a.g();
      if ($$2 != null) {
         cxg $$3 = this.a.a(0);
         cxg $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(axf.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.x() + $$2.q());
      }
   }
}
