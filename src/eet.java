import com.mojang.serialization.Codec;

public class eet extends edq<egc> {
   private static final int a = 7;

   eet(Codec<egc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egc> $$0) {
      dfd $$1 = $$0.b();
      azl $$2 = $$0.d();
      egc $$3 = $$0.f();
      je $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      je.a $$6 = new je.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         duo $$8 = $$1.a_($$6);

         for (egc.a $$9 : $$3.b) {
            if (eel.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(je.a $$0, azl $$1, je $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azl $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
