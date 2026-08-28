import javax.annotation.Nullable;

public class cxr extends cxz {
   public cxr(diq $$0, diq $$1, cwi.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cxr(cwi.a $$0, diq $$1, diq $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dfm $$1, @Nullable cou $$2, cwm $$3, dvv $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof duk $$6 && $$1.a_($$0).b() instanceof dpq $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
