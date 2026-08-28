import com.mojang.serialization.Codec;

public class efi extends eef<egr> {
   private static final int a = 7;

   efi(Codec<egr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egr> $$0) {
      dfs $$1 = $$0.b();
      azr $$2 = $$0.d();
      egr $$3 = $$0.f();
      jg $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      jg.a $$6 = new jg.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dvd $$8 = $$1.a_($$6);

         for (egr.a $$9 : $$3.b) {
            if (efa.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(jg.a $$0, azr $$1, jg $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azr $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
