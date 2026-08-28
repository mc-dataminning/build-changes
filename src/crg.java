public class crg extends crr {
   private final cre a;
   private final cmz b;
   private int g;
   private final dax h;

   public crg(cmz $$0, dax $$1, cre $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cur $$0) {
      return false;
   }

   @Override
   public cur a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cur $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cur $$0) {
      $$0.a(this.b.dP(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cmz $$0, cur $$1) {
      this.b_($$1);
      day $$2 = this.a.g();
      if ($$2 != null) {
         cur $$3 = this.a.a(0);
         cur $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
