import javax.annotation.Nullable;

public class ckp extends cjl {
   public ckp(bsx<? extends ckp> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsx<ckp> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      jd $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dga.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btr.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected avo v() {
      return avp.zm;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.zo;
   }

   @Override
   protected avo n_() {
      return avp.zn;
   }

   @Override
   avo t() {
      return avp.zp;
   }

   @Override
   protected cnd a(cuq $$0, float $$1, @Nullable cuq $$2) {
      cnd $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cnf) {
         ((cnf)$$3).a(new brz(bsb.b, 600));
      }

      return $$3;
   }
}
