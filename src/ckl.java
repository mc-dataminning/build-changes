import javax.annotation.Nullable;

public class ckl extends cku {
   public ckl(cjg.a $$0, ctc $$1, ctc $$2) {
      super($$1, $$2, $$0, ha.a);
   }

   public ckl(cjg.a $$0, ctc $$1, ctc $$2, ha $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(gw $$0, cqb $$1, @Nullable cca $$2, cjl $$3, dfd $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof deh $$6 && $$1.a_($$0).b() instanceof daa $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
