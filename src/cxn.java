public class cxn extends cxz {
   private final cxl a;
   private final csi b;
   private int g;
   private final dje h;

   public cxn(csi $$0, dje $$1, cxl $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(dak $$0) {
      return false;
   }

   @Override
   public dak a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(dak $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(dak $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(csi $$0, dak $$1) {
      this.c_($$1);
      djf $$2 = this.a.g();
      if ($$2 != null) {
         dak $$3 = this.a.a(0);
         dak $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(axi.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
