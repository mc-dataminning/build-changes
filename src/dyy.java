import com.mojang.serialization.Codec;

public class dyy extends dxv<eah> {
   private static final int a = 7;

   dyy(Codec<eah> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eah> $$0) {
      czs $$1 = $$0.b();
      axr $$2 = $$0.d();
      eah $$3 = $$0.f();
      ib $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ib.a $$6 = new ib.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         doz $$8 = $$1.a_($$6);

         for (eah.a $$9 : $$3.b) {
            if (dyq.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ib.a $$0, axr $$1, ib $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(axr $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
