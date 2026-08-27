import com.mojang.serialization.Codec;

public class dou extends dnr<dqd> {
   private static final int a = 7;

   dou(Codec<dqd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqd> $$0) {
      cqk $$1 = $$0.b();
      arx $$2 = $$0.d();
      dqd $$3 = $$0.f();
      gw $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      gw.a $$6 = new gw.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dfe $$8 = $$1.a_($$6);

         for (dqd.a $$9 : $$3.b) {
            if (dom.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(gw.a $$0, arx $$1, gw $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(arx $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
