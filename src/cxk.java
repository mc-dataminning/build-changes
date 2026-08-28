import javax.annotation.Nullable;

public class cxk extends cxs {
   public cxk(dij $$0, dij $$1, cwb.a $$2) {
      super($$0, $$1, jm.a, $$2);
   }

   public cxk(cwb.a $$0, dij $$1, dij $$2, jm $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(jh $$0, dff $$1, @Nullable cor $$2, cwf $$3, dvo $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dud $$6 && $$1.a_($$0).b() instanceof dpj $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
