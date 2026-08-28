import javax.annotation.Nullable;

public class cne extends cma {
   public cne(bvi<? extends cne> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvi<cne> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      ji $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dkg.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (bvh.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avz u() {
      return awa.Ak;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.Am;
   }

   @Override
   protected avz l_() {
      return awa.Al;
   }

   @Override
   avz m() {
      return awa.An;
   }

   @Override
   protected cpy a(cxh $$0, float $$1, @Nullable cxh $$2) {
      cpy $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqa) {
         ((cqa)$$3).a(new bue(bug.b, 600));
      }

      return $$3;
   }
}
