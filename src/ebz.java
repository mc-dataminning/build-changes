import com.mojang.serialization.Codec;

public class ebz extends eaw<edi> {
   private static final int a = 7;

   ebz(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edi> $$0) {
      dcr $$1 = $$0.b();
      azf $$2 = $$0.d();
      edi $$3 = $$0.f();
      iz $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      iz.a $$6 = new iz.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dsa $$8 = $$1.a_($$6);

         for (edi.a $$9 : $$3.b) {
            if (ebr.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(iz.a $$0, azf $$1, iz $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azf $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
