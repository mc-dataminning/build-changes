public class cuf extends csc {
   private final csq b;

   protected cuf(csq $$0, dfd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      this.a($$0, (cpr)$$1, $$2);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.b.n().a(c, Boolean.valueOf(false)).a(a, $$0.c(a)), 2);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csr.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
