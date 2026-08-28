import com.mojang.serialization.Codec;

public class ehs extends egp<ejb> {
   private static final int a = 7;

   ehs(Codec<ejb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejb> $$0) {
      dhx $$1 = $$0.b();
      bac $$2 = $$0.d();
      ejb $$3 = $$0.f();
      jh $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      jh.a $$6 = new jh.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dxo $$8 = $$1.a_($$6);

         for (ejb.a $$9 : $$3.b) {
            if (ehk.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(jh.a $$0, bac $$1, jh $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(bac $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
