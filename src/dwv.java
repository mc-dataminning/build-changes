import com.mojang.serialization.Codec;

public class dwv extends dvs<dye> {
   private static final int a = 7;

   dwv(Codec<dye> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dye> $$0) {
      cxw $$1 = $$0.b();
      axd $$2 = $$0.d();
      dye $$3 = $$0.f();
      ib $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ib.a $$6 = new ib.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dnb $$8 = $$1.a_($$6);

         for (dye.a $$9 : $$3.b) {
            if (dwn.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ib.a $$0, axd $$1, ib $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(axd $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
