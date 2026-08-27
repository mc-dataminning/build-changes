public class coz<T extends bof & bou> extends cpl {
   private final bol<T> a;
   private final int b;

   public coz(cpl.a $$0, bol<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if ($$0.B) {
         return bmm.c($$3);
      } else {
         bof $$4 = $$1.cX();
         if ($$1.bL() && $$4 instanceof bou $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, box.d($$2));
            if ($$3.b()) {
               cpq $$6 = $$3.b(cpt.qU, 1);
               return bmm.a($$6);
            }

            return bmm.a($$3);
         }

         $$1.b(atz.c.b(this));
         return bmm.c($$3);
      }
   }
}
