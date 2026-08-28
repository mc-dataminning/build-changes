import javax.annotation.Nullable;

public class cvu extends cwc {
   public cvu(cum.a $$0, dfb $$1, dfb $$2) {
      super($$1, $$2, $$0, je.a);
   }

   public cvu(cum.a $$0, dfb $$1, dfb $$2, je $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(iz $$0, dca $$1, @Nullable cmz $$2, cur $$3, dse $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqt $$6 && $$1.a_($$0).b() instanceof dmb $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
