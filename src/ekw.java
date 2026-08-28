import com.mojang.serialization.Codec;

public class ekw extends ejt<emf> {
   private static final int a = 7;

   ekw(Codec<emf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<emf> $$0) {
      dkg $$1 = $$0.b();
      azv $$2 = $$0.d();
      emf $$3 = $$0.f();
      iv $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      iv.a $$6 = new iv.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         eao $$8 = $$1.a_($$6);

         for (emf.a $$9 : $$3.b) {
            if (eko.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(iv.a $$0, azv $$1, iv $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azv $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
