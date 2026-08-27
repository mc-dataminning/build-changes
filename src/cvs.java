import javax.annotation.Nullable;

public class cvs extends cwa {
   public cvs(cuc.a $$0, dfc $$1, dfc $$2) {
      super($$1, $$2, $$0, iw.a);
   }

   public cvs(cuc.a $$0, dfc $$1, dfc $$2, iw $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ir $$0, dca $$1, @Nullable cly $$2, cuh $$3, dtc $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof drr $$6 && $$1.a_($$0).b() instanceof dmq $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
