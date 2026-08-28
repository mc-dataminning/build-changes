import javax.annotation.Nullable;

public class cmj extends clf {
   public cmj(bur<? extends cmj> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public static boolean a(bur<cmj> $$0, dgy $$1, buq $$2, ji $$3, azh $$4) {
      ji $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(djn.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (buq.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avz u() {
      return awa.Aa;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Ac;
   }

   @Override
   protected avz o_() {
      return awa.Ab;
   }

   @Override
   avz p() {
      return awa.Ad;
   }

   @Override
   protected cpd a(cwo $$0, float $$1, @Nullable cwo $$2) {
      cpd $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpf) {
         ((cpf)$$3).a(new btp(btr.b, 600));
      }

      return $$3;
   }
}
