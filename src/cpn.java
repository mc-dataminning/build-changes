import javax.annotation.Nullable;

public class cpn extends coi {
   public cpn(bxe<? extends cpn> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bxe<cpn> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      iw $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dng.rx));

      return b($$0, $$1, $$2, $$3, $$4) && (bxd.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awq u() {
      return awr.Aq;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.As;
   }

   @Override
   protected awq l_() {
      return awr.Ar;
   }

   @Override
   awq m() {
      return awr.At;
   }

   @Override
   protected csh a(daa $$0, float $$1, @Nullable daa $$2) {
      csh $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof csk) {
         ((csk)$$3).a(new bvz(bwb.b, 600));
      }

      return $$3;
   }
}
