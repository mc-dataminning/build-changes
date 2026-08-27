public class cfl extends cfv {
   private final cfj a;
   private final cbm b;
   private int c;
   private final coh h;

   public cfl(cbm $$0, coh $$1, cfj $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cix $$0) {
      return false;
   }

   @Override
   public cix a(int $$0) {
      if (this.f()) {
         this.c = this.c + Math.min($$0, this.e().L());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cix $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cix $$0) {
      $$0.a(this.b.dK(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(cbm $$0, cix $$1) {
      this.b_($$1);
      coi $$2 = this.a.g();
      if ($$2 != null) {
         cix $$3 = this.a.a(0);
         cix $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(apg.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.t(this.h.q() + $$2.o());
      }
   }
}
