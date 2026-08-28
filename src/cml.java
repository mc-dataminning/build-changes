import javax.annotation.Nullable;

public class cml extends clh {
   public cml(but<? extends cml> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public static boolean a(but<cml> $$0, dha $$1, bus $$2, ji $$3, azh $$4) {
      ji $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(djp.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (bus.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avz u() {
      return awa.Aa;
   }

   @Override
   protected avz e(btc $$0) {
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
   protected cpf a(cwq $$0, float $$1, @Nullable cwq $$2) {
      cpf $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cph) {
         ((cph)$$3).a(new btr(btt.b, 600));
      }

      return $$3;
   }
}
