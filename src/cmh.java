import javax.annotation.Nullable;

public class cmh extends cld {
   public cmh(bup<? extends cmh> $$0, dff $$1) {
      super($$0, $$1);
   }

   public static boolean a(bup<cmh> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dil.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (buo.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awn w() {
      return awo.zq;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.zs;
   }

   @Override
   protected awn o_() {
      return awo.zr;
   }

   @Override
   awn t() {
      return awo.zt;
   }

   @Override
   protected coy a(cwf $$0, float $$1, @Nullable cwf $$2) {
      coy $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpa) {
         ((cpa)$$3).a(new btn(btp.b, 600));
      }

      return $$3;
   }
}
