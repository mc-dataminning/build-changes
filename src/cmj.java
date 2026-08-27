import javax.annotation.Nullable;

public class cmj extends cms {
   public cmj(cle.a $$0, cva $$1, cva $$2) {
      super($$1, $$2, $$0, hx.a);
   }

   public cmj(cle.a $$0, cva $$1, cva $$2, hx $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ht $$0, csa $$1, @Nullable cdu $$2, clj $$3, dhi $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dgm $$6 && $$1.a_($$0).b() instanceof dbz $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
