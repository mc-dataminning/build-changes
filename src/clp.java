import javax.annotation.Nullable;

public class clp extends ckl {
   public clp(bty<? extends clp> $$0, dej $$1) {
      super($$0, $$1);
   }

   public static boolean a(bty<clp> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      jf $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dho.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btx.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awf w() {
      return awg.zs;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.zu;
   }

   @Override
   protected awf o_() {
      return awg.zt;
   }

   @Override
   awf t() {
      return awg.zv;
   }

   @Override
   protected coe a(cvs $$0, float $$1, @Nullable cvs $$2) {
      coe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cog) {
         ((cog)$$3).a(new bsy(bta.b, 600));
      }

      return $$3;
   }
}
