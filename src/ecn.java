import com.mojang.serialization.Codec;

public class ecn extends ebk<edw> {
   private static final int a = 7;

   ecn(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edw> $$0) {
      ddb $$1 = $$0.b();
      ayo $$2 = $$0.d();
      edw $$3 = $$0.f();
      ja $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ja.a $$6 = new ja.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dsk $$8 = $$1.a_($$6);

         for (edw.a $$9 : $$3.b) {
            if (ecf.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ja.a $$0, ayo $$1, ja $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(ayo $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
