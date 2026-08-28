import javax.annotation.Nullable;

public class cxg extends cxo {
   public cxg(die $$0, die $$1, cvx.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cxg(cvx.a $$0, die $$1, die $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dfb $$1, @Nullable com $$2, cwb $$3, dvj $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dty $$6 && $$1.a_($$0).b() instanceof dpe $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
