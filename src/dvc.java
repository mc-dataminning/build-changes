import com.mojang.serialization.Codec;

public class dvc extends dtz<dwl> {
   private static final int a = 7;

   dvc(Codec<dwl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwl> $$0) {
      cwm $$1 = $$0.b();
      awp $$2 = $$0.d();
      dwl $$3 = $$0.f();
      hz $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      hz.a $$6 = new hz.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dlj $$8 = $$1.a_($$6);

         for (dwl.a $$9 : $$3.b) {
            if (duu.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(hz.a $$0, awp $$1, hz $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(awp $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
