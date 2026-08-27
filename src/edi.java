import com.mojang.serialization.Codec;

public class edi extends eca<ees> {
   private static final int a = 7;

   edi(Codec<ees> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<ees> $$0) {
      dcv $$1 = $$0.b();
      ayt $$2 = $$0.d();
      ees $$3 = $$0.f();
      ir $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ir.a $$6 = new ir.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dtc $$8 = $$1.a_($$6);

         for (ees.a $$9 : $$3.b) {
            if (ecw.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ir.a $$0, ayt $$1, ir $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(ayt $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
