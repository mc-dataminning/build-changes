import javax.annotation.Nullable;

public class cmk extends clg {
   public cmk(bus<? extends cmk> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static boolean a(bus<cmk> $$0, dgz $$1, bur $$2, ji $$3, azh $$4) {
      ji $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(djo.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (bur.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avz u() {
      return awa.Aa;
   }

   @Override
   protected avz e(btb $$0) {
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
   protected cpe a(cwp $$0, float $$1, @Nullable cwp $$2) {
      cpe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpg) {
         ((cpg)$$3).a(new btq(bts.b, 600));
      }

      return $$3;
   }
}
