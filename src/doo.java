import com.mojang.serialization.Codec;

public class doo extends dnl<dpx> {
   private static final int a = 7;

   doo(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpx> $$0) {
      cqe $$1 = $$0.b();
      art $$2 = $$0.d();
      dpx $$3 = $$0.f();
      gv $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      gv.a $$6 = new gv.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dey $$8 = $$1.a_($$6);

         for (dpx.a $$9 : $$3.b) {
            if (dog.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(gv.a $$0, art $$1, gv $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(art $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
