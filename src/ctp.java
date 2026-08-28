public class ctp extends cua {
   private final ctn a;
   private final coy b;
   private int g;
   private final dff h;

   public ctp(coy $$0, dff $$1, ctn $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cwq $$0) {
      return false;
   }

   @Override
   public cwq a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwq $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cwq $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(coy $$0, cwq $$1) {
      this.b_($$1);
      dfg $$2 = this.a.g();
      if ($$2 != null) {
         cwq $$3 = this.a.a(0);
         cwq $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.x() + $$2.q());
      }
   }
}
