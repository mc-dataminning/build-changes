import com.mojang.serialization.Codec;

public class eln extends ekk<emx> {
   private static final int a = 7;

   eln(Codec<emx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emx> $$0) {
      dkw $$1 = $$0.b();
      azx $$2 = $$0.d();
      emx $$3 = $$0.f();
      iv $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      iv.a $$6 = new iv.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         ebe $$8 = $$1.a_($$6);

         for (emx.a $$9 : $$3.b) {
            if (elf.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(iv.a $$0, azx $$1, iv $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azx $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
