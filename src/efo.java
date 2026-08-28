import com.mojang.serialization.Codec;

public class efo extends eel<egx> {
   private static final int a = 7;

   efo(Codec<egx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egx> $$0) {
      dfy $$1 = $$0.b();
      azs $$2 = $$0.d();
      egx $$3 = $$0.f();
      jh $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      jh.a $$6 = new jh.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dvj $$8 = $$1.a_($$6);

         for (egx.a $$9 : $$3.b) {
            if (efg.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(jh.a $$0, azs $$1, jh $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azs $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
