public class cii<T extends bil & biy> extends civ {
   private final bip<T> a;
   private final int b;

   public cii(civ.a $$0, bip<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgu.c($$3);
      } else {
         bil $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof biy $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cja $$6 = new cja(cjd.qh);
               $$6.c($$3.v());
               return bgu.a($$6);
            }

            return bgu.a($$3);
         }

         $$1.b(apj.c.b(this));
         return bgu.c($$3);
      }
   }
}
