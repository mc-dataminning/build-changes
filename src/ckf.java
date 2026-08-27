import javax.annotation.Nullable;

public class ckf extends cko {
   public ckf(cja.a $$0, csv $$1, csv $$2) {
      super($$1, $$2, $$0, hc.a);
   }

   public ckf(cja.a $$0, csv $$1, csv $$2, hc $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(gw $$0, cpv $$1, @Nullable cbu $$2, cjf $$3, dfj $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof ded $$6 && $$1.a_($$0).b() instanceof czv $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
