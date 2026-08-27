public class cto extends csc {
   private static final float a = 3.0F;

   public cto(dfc $$0, cuc.a $$1) {
      super($$0, $$1);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      ewu $$3 = $$1.bC();
      ewu $$4 = $$1.b($$1.dM(), $$1.dK());
      ewu $$5 = $$3.e($$4.a($$1.gN()));
      ewq $$6 = $$0.a(new dbj($$3, $$5, dbj.a.b, dbj.b.b, $$1));
      cuh $$7 = $$1.b($$2);
      if ($$6.c() == ews.a.a) {
         ewu $$8 = $$3.e($$4.a(3.0));
         bqa $$9 = super.a(new cyd($$1, $$2, $$7, new ewq($$8, $$1.cM(), ir.a($$8), false)));
         return new bqb<>($$9, $$7);
      } else {
         bqa $$10 = super.a(new cyf($$1, $$2, $$6));
         return new bqb<>($$10, $$7);
      }
   }
}
