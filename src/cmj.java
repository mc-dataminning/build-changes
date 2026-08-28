import javax.annotation.Nullable;

public class cmj extends clf {
   public cmj(bur<? extends cmj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static boolean a(bur<cmj> $$0, dgz $$1, buq $$2, ji $$3, azh $$4) {
      ji $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(djo.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (buq.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avz u() {
      return awa.Ab;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Ad;
   }

   @Override
   protected avz o_() {
      return awa.Ac;
   }

   @Override
   avz p() {
      return awa.Ae;
   }

   @Override
   protected cpe a(cwp $$0, float $$1, @Nullable cwp $$2) {
      cpe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpg) {
         ((cpg)$$3).a(new btp(btr.b, 600));
      }

      return $$3;
   }
}
