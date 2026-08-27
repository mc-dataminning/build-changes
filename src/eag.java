import com.mojang.serialization.Codec;

public class eag extends dzd<ebp> {
   private static final int a = 7;

   eag(Codec<ebp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebp> $$0) {
      day $$1 = $$0.b();
      ayg $$2 = $$0.d();
      ebp $$3 = $$0.f();
      in $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      in.a $$6 = new in.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dqh $$8 = $$1.a_($$6);

         for (ebp.a $$9 : $$3.b) {
            if (dzy.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(in.a $$0, ayg $$1, in $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(ayg $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
