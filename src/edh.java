import com.mojang.serialization.Codec;

public class edh extends ece<eeq> {
   private static final int a = 7;

   edh(Codec<eeq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eeq> $$0) {
      dds $$1 = $$0.b();
      ayw $$2 = $$0.d();
      eeq $$3 = $$0.f();
      jd $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      jd.a $$6 = new jd.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dtc $$8 = $$1.a_($$6);

         for (eeq.a $$9 : $$3.b) {
            if (ecz.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(jd.a $$0, ayw $$1, jd $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(ayw $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
