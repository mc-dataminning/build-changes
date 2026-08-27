import com.mojang.serialization.Codec;

public class dtf extends dsc<duo> {
   private static final int a = 7;

   dtf(Codec<duo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<duo> $$0) {
      cus $$1 = $$0.b();
      auw $$2 = $$0.d();
      duo $$3 = $$0.f();
      hx $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      hx.a $$6 = new hx.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         djp $$8 = $$1.a_($$6);

         for (duo.a $$9 : $$3.b) {
            if (dsx.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(hx.a $$0, auw $$1, hx $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(auw $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
