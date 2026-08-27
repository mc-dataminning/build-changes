import com.mojang.serialization.Codec;

public class dqy extends dpv<dsh> {
   private static final int a = 7;

   dqy(Codec<dsh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsh> $$0) {
      csu $$1 = $$0.b();
      ats $$2 = $$0.d();
      dsh $$3 = $$0.f();
      ht $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ht.a $$6 = new ht.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dhi $$8 = $$1.a_($$6);

         for (dsh.a $$9 : $$3.b) {
            if (dqq.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ht.a $$0, ats $$1, ht $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(ats $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
