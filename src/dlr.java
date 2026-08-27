import com.mojang.serialization.Codec;

public class dlr extends dko<dna> {
   private static final int a = 7;

   dlr(Codec<dna> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dna> $$0) {
      cng $$1 = $$0.b();
      apf $$2 = $$0.d();
      dna $$3 = $$0.f();
      gu $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      gu.a $$6 = new gu.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dcb $$8 = $$1.a_($$6);

         for (dna.a $$9 : $$3.b) {
            if (dlj.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(gu.a $$0, apf $$1, gu $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(apf $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
