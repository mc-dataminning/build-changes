import com.mojang.serialization.Codec;

public class elp extends ekm<emz> {
   private static final int a = 7;

   elp(Codec<emz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emz> $$0) {
      dky $$1 = $$0.b();
      azz $$2 = $$0.d();
      emz $$3 = $$0.f();
      iw $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      iw.a $$6 = new iw.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         ebg $$8 = $$1.a_($$6);

         for (emz.a $$9 : $$3.b) {
            if (elh.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(iw.a $$0, azz $$1, iw $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(azz $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
