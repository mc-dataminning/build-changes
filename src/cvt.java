import javax.annotation.Nullable;

public class cvt extends cwb {
   public cvt(cul.a $$0, dfa $$1, dfa $$2) {
      super($$1, $$2, $$0, je.a);
   }

   public cvt(cul.a $$0, dfa $$1, dfa $$2, je $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(iz $$0, dbz $$1, @Nullable cmy $$2, cuq $$3, dsd $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dqs $$6 && $$1.a_($$0).b() instanceof dma $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
