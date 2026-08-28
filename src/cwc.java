public class cwc extends cwn {
   private final cwa a;
   private final cqy b;
   private int g;
   private final dhs h;

   public cwc(cqy $$0, dhs $$1, cwa $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cyy $$0) {
      return false;
   }

   @Override
   public cyy a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cyy $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void c_(cyy $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cqy $$0, cyy $$1) {
      this.c_($$1);
      dht $$2 = this.a.g();
      if ($$2 != null) {
         cyy $$3 = this.a.a(0);
         cyy $$4 = this.a.a(1);
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
