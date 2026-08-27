import javax.annotation.Nullable;

public class cny extends coh {
   public cny(cmt.a $$0, cwq $$1, cwq $$2) {
      super($$1, $$2, $$0, ic.a);
   }

   public cny(cmt.a $$0, cwq $$1, cwq $$2, ic $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(hx $$0, ctp $$1, @Nullable cfi $$2, cmy $$3, djh $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof die $$6 && $$1.a_($$0).b() instanceof ddp $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
