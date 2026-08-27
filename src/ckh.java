import javax.annotation.Nullable;

public class ckh extends ckq {
   public ckh(cjc.a $$0, csx $$1, csx $$2) {
      super($$1, $$2, $$0, hc.a);
   }

   public ckh(cjc.a $$0, csx $$1, csx $$2, hc $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(gw $$0, cpx $$1, @Nullable cbw $$2, cjh $$3, dfl $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof def $$6 && $$1.a_($$0).b() instanceof czx $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
