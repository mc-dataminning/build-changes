import javax.annotation.Nullable;

public class dan extends dav {
   public dan(dmm $$0, dmm $$1, czg.a $$2) {
      super($$0, $$1, jb.a, $$2);
   }

   public dan(czg.a $$0, dmm $$1, dmm $$2, jb $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iv $$0, djh $$1, @Nullable crj $$2, czk $$3, eao $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dza $$6 && $$1.a_($$0).b() instanceof dtw $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
