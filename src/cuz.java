public class cuz extends cvk {
   private final cux a;
   private final cqi b;
   private int g;
   private final dgm h;

   public cuz(cqi $$0, dgm $$1, cux $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cxy $$0) {
      return false;
   }

   @Override
   public cxy a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cxy $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cxy $$0) {
      $$0.a(this.b.dV(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cqi $$0, cxy $$1) {
      this.b_($$1);
      dgn $$2 = this.a.g();
      if ($$2 != null) {
         cxy $$3 = this.a.a(0);
         cxy $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awu.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.s(this.h.t() + $$2.q());
      }
   }
}
