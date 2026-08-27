public class cit<T extends biw & bjj> extends cjg {
   private final bja<T> a;
   private final int b;

   public cit(cjg.a $$0, bja<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      if ($$0.B) {
         return bhf.c($$3);
      } else {
         biw $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof bjj $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               cjl $$6 = new cjl(cjo.qh);
               $$6.c($$3.v());
               return bhf.a($$6);
            }

            return bhf.a($$3);
         }

         $$1.b(apq.c.b(this));
         return bhf.c($$3);
      }
   }
}
