import com.mojang.serialization.Codec;

public class dsf extends drc<dto> {
   private static final int a = 7;

   dsf(Codec<dto> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dto> $$0) {
      ctt $$1 = $$0.b();
      auf $$2 = $$0.d();
      dto $$3 = $$0.f();
      hv $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      hv.a $$6 = new hv.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dip $$8 = $$1.a_($$6);

         for (dto.a $$9 : $$3.b) {
            if (drx.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(hv.a $$0, auf $$1, hv $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(auf $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
