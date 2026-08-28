import javax.annotation.Nullable;

public class cvr extends cvz {
   public cvr(cuj.a $$0, dey $$1, dey $$2) {
      super($$1, $$2, $$0, je.a);
   }

   public cvr(cuj.a $$0, dey $$1, dey $$2, je $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(iz $$0, dbx $$1, @Nullable cmw $$2, cuo $$3, dsb $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqq $$6 && $$1.a_($$0).b() instanceof dly $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
