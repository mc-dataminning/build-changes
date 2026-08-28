import com.mojang.serialization.Codec;

public class eef extends edc<efo> {
   private static final int a = 7;

   eef(Codec<efo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efo> $$0) {
      dep $$1 = $$0.b();
      azk $$2 = $$0.d();
      efo $$3 = $$0.f();
      je $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      je.a $$6 = new je.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dua $$8 = $$1.a_($$6);

         for (efo.a $$9 : $$3.b) {
            if (edx.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(je.a $$0, azk $$1, je $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azk $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
