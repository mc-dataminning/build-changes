import javax.annotation.Nullable;

public class cqd extends cqm {
   public cqd(coy.a $$0, cys $$1, cys $$2) {
      super($$1, $$2, $$0, ie.a);
   }

   public cqd(coy.a $$0, cys $$1, cys $$2, ie $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hz $$0, cvr $$1, @Nullable chl $$2, cpd $$3, dlj $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dkg $$6 && $$1.a_($$0).b() instanceof dfr $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
