import javax.annotation.Nullable;

public class cjz extends civ {
   public cjz(bsj<? extends cjz> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsj<cjz> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      ja $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfh.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btc.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected ave v() {
      return avf.zm;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.zo;
   }

   @Override
   protected ave o_() {
      return avf.zn;
   }

   @Override
   ave u() {
      return avf.zp;
   }

   @Override
   protected cmn a(cua $$0, float $$1, @Nullable cua $$2) {
      cmn $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cmp) {
         ((cmp)$$3).a(new brl(brn.b, 600));
      }

      return $$3;
   }
}
