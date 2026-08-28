import javax.annotation.Nullable;

public class cmi extends cle {
   public cmi(buq<? extends cmi> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static boolean a(buq<cmi> $$0, dgx $$1, bup $$2, ji $$3, azg $$4) {
      ji $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(djm.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (bup.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avy u() {
      return avz.Aa;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Ac;
   }

   @Override
   protected avy o_() {
      return avz.Ab;
   }

   @Override
   avy p() {
      return avz.Ad;
   }

   @Override
   protected cpc a(cwn $$0, float $$1, @Nullable cwn $$2) {
      cpc $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpe) {
         ((cpe)$$3).a(new bto(btq.b, 600));
      }

      return $$3;
   }
}
