public class cqd extends cqo {
   private final cqb a;
   private final clw b;
   private int c;
   private final czu h;

   public cqd(clw $$0, czu $$1, cqb $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cto $$0) {
      return false;
   }

   @Override
   public cto a(int $$0) {
      if (this.h()) {
         this.c = this.c + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cto $$0, int $$1) {
      this.c += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cto $$0) {
      $$0.a(this.b.dP(), this.b, this.c);
      this.c = 0;
   }

   @Override
   public void a(clw $$0, cto $$1) {
      this.b_($$1);
      czv $$2 = this.a.g();
      if ($$2 != null) {
         cto $$3 = this.a.a(0);
         cto $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(avr.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
